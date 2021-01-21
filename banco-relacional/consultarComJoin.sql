SELECT * FROM estados e, cidades c WHERE e.id = c.estado_id; 
SELECT e.nome as Estado, c.nome as Cidade, e.regiao as Regiao from estados e, cidades c Where e.id = c.estado_id; 
SELECT c.nome as Cidade, e.nome as Estado, regiao as Regiao from estados e INNER JOIN cidades c on e.id = c.estado_id;