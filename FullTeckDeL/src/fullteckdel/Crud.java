package fullteckdel;
import java.util.Scanner;
public class Crud extends Aluno {
    
    
      //Metodos
    Scanner teclado = new Scanner(System.in);
    double gerador = Math.random();
    
    
    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Turma: " + this.getTurma());
        System.out.println("Foto: " + this.getFoto());
    }

        //CREATE 
    public void cadastro(){
    System.out.println("Digite o nome do aluno: ");
    setNome(teclado.nextLine());
    System.out.println("Gerando o numero da matricula ...");
    setMatricula(gerador);
    System.out.println(getMatricula());
    System.out.println("Informe a turma: ");
    setTurma(teclado.nextLine());   
    }
        //READ
    public void pesquisar(){
        System.out.println("Pesquisar por: nome ou matricula");
        System.out.println("Para nome digite 1 ou para matricula digite 2");
        String pesquisa = teclado.nextLine();
        switch(pesquisa){
            case "1" : 
                 String nome1 = teclado.nextLine();
                if (nome1.equals(getNome())){
                  //System.out.println("asas" + this.status());
                }else{
                  System.out.println("Aluno nao encontrado !!");
                }       
            break;  
            
            case "2" :
               Double matricula1 = teclado.nextDouble();
               if (matricula1.equals(getMatricula())) {
                   //System.out.println(this.status());
               }else{
                   System.out.println("Aluno nao encontrado !!");
               }
            break;
            
        }      
    }
        //UPDATE
    public void atualizar(){
        System.out.println("atualizar os registros do aluno: ");
        String nomealuno = teclado.nextLine();
        if (nomealuno.equals(getNome())){
            System.out.println("Deseja atualizar : nome, turma, matricula ou foto");
            System.out.println("Digite 1 para nome, digite 2 para turma, digite 3 para matricula ou digite 4 para foto");
            int atualizar1 = teclado.nextInt();
            switch(atualizar1){
                case 1 :
                    setNome(teclado.nextLine());
                break;
            
                case 2 :
                    setTurma(teclado.nextLine());
                break;
            
                case 3 :
                    setMatricula(teclado.nextDouble());
                break;
            
                case 4 :
                    setFoto(teclado.nextLine());
                break;
            }
        }
    }
        //DELETE
    public void delete(){
        System.out.println("Apagar registro do aluno: ");
        String nomealuno1 = teclado.nextLine();
        if(nomealuno1.equals(getNome())){
            System.out.println("Apagar nome, turma, matricula ou foto");
            System.out.println("Para nome digite 1, para turma digite 2, para matricula digite 3, para foto digite 4");
            int  apagar = teclado.nextInt();
            switch(apagar){
                case 1 :
                    System.out.println("Apagando nome !");
                break;
            
                case 2 :
                    System.out.println("apagando turma !");
                break;
            
                case 3 :
                    System.out.println("apagamdo matricula !");
                break;
            
                case 4 :
                    System.out.println("apagando foto !");
                break;
            }
        }
    }
}