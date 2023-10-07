public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(peso < 52.2){
            this.categoria = "Inválido.";
        } else if (peso <= 70.3){
            this.categoria = "Leve.";
        } else if (peso <= 83.3){
            this.categoria = "Médio.";
        } else if (peso <= 120.2){
            this.categoria = "Peso Pesado.";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("Lutador: " + nome);
        System.out.println("Origem: " + nacionalidade);
        System.out.println("Idade: " + idade + " anos.");
        System.out.println("Altura: " + altura + " m de altura.");
        System.out.println("Pesando: " + peso + " kgs");
        System.out.println("Empates: " + empates);
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
    }
    public void status(){
        System.out.println(nome + " é um peso " + categoria + " com " + vitorias + " vitorias e " + derrotas + " derrotas." );

    }
    public void ganharLuta(){
        vitorias += 1;
    }
    public void perderLuta(){
        derrotas += 1;
    }
    public void empatarLuta(){
        empates += 1;
    }
}
