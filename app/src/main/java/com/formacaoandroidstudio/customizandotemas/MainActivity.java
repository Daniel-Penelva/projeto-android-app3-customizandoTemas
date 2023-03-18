package com.formacaoandroidstudio.customizandotemas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * O arquivo 'colors.xml' define um padrão de cores que você irá aplicar para seu app.
     * No caso, o valor 'colorAccent' define as cores dos componentes.
     * Já o valor 'color Primary' define a cor de fundo do nome do app.
     * Já o valor 'colorPrimaryDark' define a cor de fundo onde estão os dados de bateria, wiffi, rede telefonica, etc...
     *
     *
     * Para definir uma cor de fundo (background) do app - É preciso criar um estilo no arquivo 'styles.xml'.
     * Mas, antes de criar o estilo para cor de fundo, é preciso primeiro definir a cor de fundo que você quer
     * colocar no app. Para isso você vai no activity_main.xml e clica no layout do app, vai em 'attributes' e
     * procure por background e crie uma cor através do 'Pick resources'. Ao fazer isso automaticamente irá criar
     * uma tag com a definição dessa cor no arquivo colors.xml
     *
     * Arquivo Colors.xml - cria automaticamente essa tag - Exemplo:
     * (color name="cor_fundo_app")#8D0C02(color)
     *
     * Depois apenas faça essa referência 'cor_fundo_app' na tag 'item' da propridade 'name' e do valor
     * 'android:windowBackground' que fica no arquivo styles.xml - Exemplo:
     *
     *  (item name="android:windowBackground")@color/cor_fundo_app(item/)
     *
     *  OBS. É possível fazer esse mesmo processo com as cores de textos!!! Sem falar de tantas outras funcionalidades!
     *
     *  OBS. Você pode tb criar diretamente a tag co colors.xml, por exemplo, quero colocar uma cor de texto do título
     *  do app, basta inserir a tag no colors.xml:
     *
     *  (color name="cor_titulo")#FF121212(color)
     *
     *  Depois vai no arquivo de styles.xml e adiciona a seguinte tag:
     *   (item name="colorPrimary")@color/cor_titulo(/item)
     *
     *  Detalhe para sobrescrever a cor do título é preciso apagar a classe 'DarkActionBar'.
     *
     *  Sem sobreescrever a cor:
     *  (style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar")
     *
     *  Sobreescrever a cor:
     *  (style name="AppTheme" parent="Theme.AppCompat.Light)
     *
     * */
}
