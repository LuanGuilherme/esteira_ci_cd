package com.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BibliotecaTest {
        /**
         * Test do construtor sem parâmetros
         */
        @Test
        public void testConstrutorSemParametros() {
                Biblioteca bib = new Biblioteca();
                Assert.assertNotNull(bib.livros);
                Assert.assertNotNull(bib.autores);
                Assert.assertNotNull(bib.editoras);
                Assert.assertNotNull(bib.estoque);
        }

        @Test
        public void testAdicionarLivro() {
                Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
                Editora editora = new Editora("Nome da Editora");
                Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);

                Biblioteca bib = new Biblioteca();

                bib.AdicionarLivro(livro);
                Assert.assertEquals(bib.livros.get(bib.livros.size() - 1), livro);
        }

        @Test
        public void testAdicionarAutor() {
                Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");

                Biblioteca bib = new Biblioteca();

                bib.AdicionarAutor(autor);
                Assert.assertEquals(bib.autores.get(bib.autores.size() - 1), autor);
        }

        @Test
        public void testAdicionarEditora() {
                Editora editora = new Editora("Nome da Editora");

                Biblioteca bib = new Biblioteca();

                bib.AdicionarEditora(editora);
                Assert.assertEquals(bib.editoras.get(bib.editoras.size() - 1), editora);
        }

        @Test
        public void testAdicionarEstoque() {
                Autor autor = new Autor("Nome do Autor", "Sobrenome do autor");
                Editora editora = new Editora("Nome da Editora");
                Livro livro = new Livro(autor, editora, "1234567890", "Título do Livro", 200);

                LivroEstoque livroEstoque = new LivroEstoque(livro, 10, 50.0);

                Biblioteca bib = new Biblioteca();

                bib.AdicionarEstoque(livroEstoque);
                Assert.assertEquals(bib.estoque.get(bib.estoque.size() - 1), livroEstoque);
        }
        
}