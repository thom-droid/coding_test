SELECT CONCAT('/home/grep/src/', board_id, '/',
              file_id, file_name, file_ext) AS file_path
FROM programmers.used_goods_files
WHERE board_id = ( SELECT board_id
                   FROM used_goods_boards
                   ORDER BY views DESC
                   LIMIT 1 );