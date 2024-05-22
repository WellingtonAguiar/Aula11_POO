public class FolhaPGTO {
    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        //Empregados mensalista
        men1 = new Mensalista("Jose", "Rua abc", 0, "Junior");
        men1.calcularSalario();
        men1.calcINSS();
        men1.calcularIRPF();
        men1.imprimir();

        men2 = new Mensalista("Ana", "Rua sem fim", 0, "Sênio");
        men2.calcularSalario();
        men2.calcINSS();
        men2.calcularIRPF();
        men2.imprimir();

        //Empregados horistas
        hora1 = new Horista ("Carlos", "Rua xyz", 0, 20, 50);
        hora1.calcularSalario();
        hora1.imprimir();

        hora2 = new Horista("Cristina", "Rua do Centro", 0, 100, 80);
        hora2.calcularSalario();
        hora2.imprimir();

    }
}
