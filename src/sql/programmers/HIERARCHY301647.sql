SELECT c.id       AS id,
       c.genotype AS genotype,
       p.genotype AS parent_genotype
FROM ecoli_data p
JOIN ecoli_data c ON p.id = c.parent_id AND p.id != c.id
WHERE c.genotype & p.genotype = p.genotype
ORDER BY c.id;

# bit AND (&) : 두 비트가 모두 1일 때만 1을 반환
# 즉, 자식의 genotype이 부모의 genotype을 모두 포함하는지 확인