SELECT sample_id,
       dna_sequence,
       species,
       CASE WHEN dna_sequence REGEXP '^ATG' THEN 1 ELSE 0 END    AS has_start,
       CASE
           WHEN dna_sequence REGEXP 'TAA$'
               OR dna_sequence REGEXP 'TAG$'
               OR dna_sequence REGEXP 'TGA$'
               THEN 1
           ELSE 0 END                                              AS has_stop,
       CASE WHEN INSTR(dna_sequence, 'ATAT') > 0 THEN 1 ELSE 0 END AS has_atat,
       CASE WHEN dna_sequence REGEXP 'G{3,}' THEN 1 ELSE 0 END      AS has_ggg
FROM samples3475;
