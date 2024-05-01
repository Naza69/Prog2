//Interfaz Contrato
public interface Contract {
    //Para calcular indice de masa corporal
    double calculateBMI();
    //Para saber si el atleta tiene sobrepeso
    boolean thereIsExtraWeight(double BMIresult);
    //Para tomar las pulsaciones
    double takeHeartBeat();
}
