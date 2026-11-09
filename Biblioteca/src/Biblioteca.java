zszimport java.util.ArrayList;
public class Biblioteca{
    private String nome;
    ArrayList<Livro> livros = new ArrayList<Livro>();

    public Biblioteca(String nome){
        this.nome = nome;
    }

    public void adicionarLivro(Livro li){
        livros.add(li);
    }

    public void listarLivros(){
        for(Livro li : livros){
            if(li.isDisponivel()){
                System.out.println(li.getTitulo() + " - Disponível");
                System.out.println();
            }
        }
    }

    public double calcularMediaPaginas(){
        double media = 0;
        for(Livro li : livros){
            media += li.getQuantidadePaginas();
        }
        return media / livros.size();
    }


    public void livroMaiorPaginas(){
        Livro maior = livros.get(0);
        for(Livro li : livros){
            if(li.getQuantidadePaginas() > maior.getQuantidadePaginas()){
                maior = li;
            }
        }
        System.out.println("Livro com mais páginas: " + maior.getTitulo() + " - " + maior.getQuantidadePaginas());
    }

    

    







}

