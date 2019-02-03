package br.com.devmedia.curso_java_oo.aula09Constantes;

public enum TrueOrFalse {
    FALSE(0, "False"), TRUE(1, "True");

    private int index;
    protected String desc;

    public int getIndex() {
        return index;
    }

    public String getDesc() {
        return desc;
    }

    private TrueOrFalse(int index, String desc) {
        this.index = index;
        this.desc = desc;
    }


}
