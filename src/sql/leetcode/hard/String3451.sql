SELECT ip, count(ip) invalid_count
FROM logs3451
where not REGEXP_LIKE(ip,
  '^(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])([.](25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])){3}$'
)
group by ip
