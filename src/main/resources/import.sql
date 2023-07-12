INSERT INTO tb_categoria (nome_categoria) VALUES ('Camisetas');
INSERT INTO tb_categoria (nome_categoria) VALUES ('Calças');

INSERT INTO tb_produto (nome_produto, valor_produto, image_url_produto, video_url_produto, unidade_medida_produto, status_produto) VALUES ('Camiseta estampada', 29.99, 'https://exemplo.com/camiseta.jpg', 'https://exemplo.com/video_camiseta.mp4', 'unidade', 'disponível');
INSERT INTO tb_produto (nome_produto, valor_produto, image_url_produto, video_url_produto, unidade_medida_produto, status_produto) VALUES ('Camiseta de manga curta', 29.99, 'https://exemplo.com/camiseta.jpg', 'https://exemplo.com/video_camiseta.mp4', 'unidade', 'disponível');
INSERT INTO tb_produto (nome_produto, valor_produto, image_url_produto, video_url_produto, unidade_medida_produto, status_produto) VALUES ('Camiseta de manga comprida', 29.99, 'https://exemplo.com/camiseta.jpg', 'https://exemplo.com/video_camiseta.mp4', 'unidade', 'disponível');
INSERT INTO tb_produto (nome_produto, valor_produto, image_url_produto, video_url_produto, unidade_medida_produto, status_produto) VALUES ('Camiseta polo', 29.99, 'https://exemplo.com/camiseta.jpg', 'https://exemplo.com/video_camiseta.mp4', 'unidade', 'disponível');
INSERT INTO tb_produto (nome_produto, valor_produto, image_url_produto, video_url_produto, unidade_medida_produto, status_produto) VALUES ('Camiseta regata', 29.99, 'https://exemplo.com/camiseta.jpg', 'https://exemplo.com/video_camiseta.mp4', 'unidade', 'disponível');

INSERT INTO tb_produto (nome_produto, valor_produto, image_url_produto, video_url_produto, unidade_medida_produto, status_produto) VALUES ('Calça Jeans', 59.99, 'https://exemplo.com/calca_jeans.jpg', 'https://exemplo.com/video_calca_jeans.mp4', 'unidade', 'disponível');
INSERT INTO tb_produto (nome_produto, valor_produto, image_url_produto, video_url_produto, unidade_medida_produto, status_produto) VALUES ('Calça social', 59.99, 'https://exemplo.com/calca_jeans.jpg', 'https://exemplo.com/video_calca_jeans.mp4', 'unidade', 'disponível');
INSERT INTO tb_produto (nome_produto, valor_produto, image_url_produto, video_url_produto, unidade_medida_produto, status_produto) VALUES ('Calça leggings', 59.99, 'https://exemplo.com/calca_jeans.jpg', 'https://exemplo.com/video_calca_jeans.mp4', 'unidade', 'disponível');
INSERT INTO tb_produto (nome_produto, valor_produto, image_url_produto, video_url_produto, unidade_medida_produto, status_produto) VALUES ('Calça cargo', 59.99, 'https://exemplo.com/calca_jeans.jpg', 'https://exemplo.com/video_calca_jeans.mp4', 'unidade', 'disponível');
INSERT INTO tb_produto (nome_produto, valor_produto, image_url_produto, video_url_produto, unidade_medida_produto, status_produto) VALUES ('Calça culotte', 59.99, 'https://exemplo.com/calca_jeans.jpg', 'https://exemplo.com/video_calca_jeans.mp4', 'unidade', 'disponível');

INSERT INTO tb_belonging (categoria_id, produto_id, position) VALUES (1, 1, 0);
INSERT INTO tb_belonging (categoria_id, produto_id, position) VALUES (1, 2, 1);
INSERT INTO tb_belonging (categoria_id, produto_id, position) VALUES (1, 3, 2);
INSERT INTO tb_belonging (categoria_id, produto_id, position) VALUES (1, 4, 3);
INSERT INTO tb_belonging (categoria_id, produto_id, position) VALUES (1, 5, 4);

INSERT INTO tb_belonging (categoria_id, produto_id, position) VALUES (2, 6, 0);
INSERT INTO tb_belonging (categoria_id, produto_id, position) VALUES (2, 7, 1);
INSERT INTO tb_belonging (categoria_id, produto_id, position) VALUES (2, 8, 2);
INSERT INTO tb_belonging (categoria_id, produto_id, position) VALUES (2, 9, 3);
INSERT INTO tb_belonging (categoria_id, produto_id, position) VALUES (2, 10, 4);