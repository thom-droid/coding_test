SELECT *
FROM Patients
WHERE conditions like 'DIAB1%' or conditions like '% DIAB1%';
# it filters out patients with conditions that start with 'DIAB1' or have 'DIAB1' anywhere in the string, ensuring that it is not just a substring of another condition.
# e.g 'DIAB1', 'DIAB1A', 'A DIAB1', 'B DIAB1 C' would be included, but the data like 'SADIAB1' would not be included.