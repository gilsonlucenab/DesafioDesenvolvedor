SELECT c.id_cliente, c.razao_social, t.numero 
FROM clientes c 
JOIN telefones t ON c.id_cliente = t.cliente_id 
JOIN estados ON c.estado_id = e.id_estado 
WHERE e.sigla = 'SP';