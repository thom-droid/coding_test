# Write a solution to report the fraction of players that logged
# in again on the day after the day they first logged in, rounded to 2 decimal places.
# In other words, you need to determine the number of players who logged in on the day
# immediately following their initial login, and divide it by the number of total players.

WITH nd AS (SELECT player_id,
                   LEAD(event_date) OVER (PARTITION BY player_id ORDER BY event_date)  AS next_date,
                   DENSE_RANK()     OVER (PARTITION BY player_id ORDER BY event_date)  AS rnk
            FROM activity550)
SELECT ROUND(COUNT(DISTINCT a.player_id) / (SELECT COUNT(DISTINCT player_id) FROM activity550), 2) AS active_ratio
FROM activity550 a
         JOIN nd ON a.player_id = nd.player_id
    AND nd.next_date IS NOT NULL
WHERE DATEDIFF(nd.next_date, event_date) = 1
  AND nd.rnk = 1;


-- Alternative solution using pre-aggregated data
WITH total_players AS (
    SELECT COUNT(DISTINCT player_id) AS total
    FROM activity550
),
    next_day_logins AS (
        SELECT player_id,
               Activity550.event_date,
               lead(Activity550.event_date) over (PARTITION BY Activity550.player_id ORDER BY Activity550.event_date) AS next_date,
               ROW_NUMBER() OVER (PARTITION BY Activity550.player_id ORDER BY Activity550.event_date) AS rnk
from activity550
)
SELECT ROUND(COUNT(DISTINCT nd.player_id) / (SELECT total from TOTAL_PLAYERS), 2) AS active_ratio
FROM activity550 a
JOIN NEXT_DAY_LOGINS nd on a.player_id = nd.player_id
AND nd.event_date is not NULL
WHERE DATEDIFF(nd.next_date, a.event_date) = 1
    AND nd.rnk = 1;

