public class App {
    public static void main(String[] args) throws Exception {
       Livro li1 = new Livro("Antoine Saint-Exupery", "O Pequeno Príncipe", 300);
       Livro li2 = new Livro("Ali Hazelwood ", "A Hipotese do Amor", 350);
       Livro li3 = new Livro("Oda", "One Piece", 1000);
       Livro li4 = new Livro("Emily Brontë", "O Morro dos Ventos Uivantes", 600);
       Livro li5 = new Livro("Machado de Assis", "Dom Casmurro", 200);
       Livro li6 = new Livro("George Orwell", "A Revolução dos Bichos", 400);



       Leitor l1 = new Leitor("Laila", 23);
       l1.emprestarLivro(li3);
       l1.emprestarLivro(li4);
       l1.emprestarLivro(li5);
       l1.emprestarLivro(li6);
       Leitor l2 = new Leitor("Vitin", 19);
       l2.emprestarLivro(li2);

         Biblioteca b1 = new Biblioteca("Biblioteca UFPA");
         b1.adicionarLivro(li1);
         b1.adicionarLivro(li2);
         b1.adicionarLivro(li3);
         b1.adicionarLivro(li4);
         b1.adicionarLivro(li5);
         b1.adicionarLivro(li6);

         b1.listarLivros();
         System.out.println();
         System.out.println("Média de páginas: " + b1.calcularMediaPaginas());
         System.out.println();
         b1.livroMaiorPaginas();
         System.out.println();

         l1.listarLivrosEmprestados();
         l2.listarLivrosEmprestados();

    }
}
