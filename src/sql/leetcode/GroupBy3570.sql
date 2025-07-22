SELECT lb.book_id,
         lb.title,
         lb.author,
         lb.genre,
         lb.publication_year,
        count(br.book_id) as current_burrowers
FROM library_books lb
join borrowing_records br on lb.book_id = br.book_id
where br.return_date is null
group by lb.book_id, lb.title, lb.author, lb.genre, lb.publication_year, lb.total_copies
having count(br.book_id) = lb.total_copies
order by current_burrowers desc, lb.title asc;