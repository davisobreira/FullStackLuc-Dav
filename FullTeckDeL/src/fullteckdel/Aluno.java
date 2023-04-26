package fullteckdel;


public abstract class Aluno {
          //Atributos 
    private String nome, turma, foto;
    private double matricula;
         
        //Construtor

    public Aluno() {
        this.nome = nome;
        this.turma = turma;
        this.foto = foto;
        this.matricula = matricula;
    }


    

        //Getter & Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    /*
    
    //Metodos
    Scanner teclado = new Scanner(System.in);
    double gerador = Math.random();
    
    
    public void status(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Matricula: " + this.matricula);
    System.out.println("Turma: " + this.turma);
    System.out.println("Foto: " + this.foto);
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
    System.out.println("Nome do Aluno: ");
    String nome1 = teclado.nextLine();
    if (nome1.equals(nome)){
    System.out.println(status());
    }*/        
    }

    
   

   
    

