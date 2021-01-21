Update `estados` set nome = 'Maranhão' where sigla = 'MA';
SELECT nome from `estados` where sigla = 'MA';
UPDATE `estados` SET nome = 'Paraná', populacao = 11.32 WHERE sigla = 'PR';
SELECT nome, sigla, populacao from `estados` where sigla = 'PR';
