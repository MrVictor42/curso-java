SELECT * FROM `estados`;

Select nome as 'Nome do Estado', sigla from `estados` where regiao = 'Sul';

Select nome, regiao from `estados` WHERE populacao >= 10 order by populacao desc