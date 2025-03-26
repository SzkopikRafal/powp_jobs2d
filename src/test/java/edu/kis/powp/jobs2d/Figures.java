package edu.kis.powp.jobs2d;

public enum Figures {
    FIGURE_JOE_1("Figure Joe 1"),
    FIGURE_JOE_2("Figure Joe 2"),
    FIGURE_JANE("Figures Jane"),
    FIGURE_CUS("Figure4"),
    FIGURE_CUS2("Figure5"),
    FIGURE_CUS3("Figure6");

    private final String figureName;

    Figures(String figureName) {
        this.figureName = figureName;
    }

    public String getFigureName() {
        return figureName;
    }
}
