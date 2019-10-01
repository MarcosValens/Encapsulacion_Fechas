public class Data1 {
    private final static String SEPARADOR = "-";
    private String data = "00"+SEPARADOR+"00"+SEPARADOR+"0000";

    public Data1(int dia, int mes, int any) {
        this.data = dia+SEPARADOR+mes+SEPARADOR+any;
    }

    public int getDia() {
       return Integer.parseInt(data.split(SEPARADOR)[0]);
    }

    public void setDia(int dia) {
        this.data = dia+SEPARADOR+getMes()+SEPARADOR+getAny();
    }

    public int getMes() {
        return Integer.parseInt(data.split(SEPARADOR)[1]);
    }

    public void setMes(int mes) {
        this.data = getDia()+SEPARADOR+mes+SEPARADOR+getAny();
    }

    public int getAny() {
        return Integer.parseInt(data.split(SEPARADOR)[2]);
    }

    public void setAny(int any) {
        this.data = getDia()+SEPARADOR+getMes()+SEPARADOR+any;
    }
}
