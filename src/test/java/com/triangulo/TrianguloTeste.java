package com.triangulo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class TrianguloTeste {
    @Test
    public void testDeterminarTipoEquilatero() {
        assertThat(Triangulo.determinarTipo(2, 2, 2), is(equalTo("equilátero")));
    }

    @Test
    public void testDeterminarTipoIsosceles() {
        assertThat(Triangulo.determinarTipo(2, 2, 3), is(equalTo("isósceles")));
    }

    @Test
    public void testDeterminarTipoEscaleno() {
        assertThat(Triangulo.determinarTipo(2, 3, 4), is(equalTo("escaleno")));
    }
}
