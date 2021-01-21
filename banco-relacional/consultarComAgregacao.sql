SELECT regiao as 'Região', sum(populacao) as Total from `estados` GROUP BY regiao order by Total desc;

SELECT sum(populacao) as Total from `estados`;
SELECT avg(populacao) as Total from `estados`; //media
