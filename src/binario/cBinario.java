/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

 //Todas las importaciones
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Herrera Prado Diego y Martínez Barbosa Genaro Enrique, 5IM6
 */
public class cBinario extends JFrame implements ActionListener{ //La clase cBinario se extiende de un JFrame e implementa la interfaz ActionListener
    private JFrame _ventana; //El JFrame
    private JTextField _binarioTxt1, _decimalTxt1, _binarioTxt2, _decimalTxt2; //Los campos de texto
    private JButton _binarioBtn, _decimalBtn, _calcular1, _calcular2, _regresar, _salir; //Botones
    private JLabel _titulo, _subtitulo, _binarioLbl, _decimalLbl, _label1, _label2, _aviso1, _aviso2;  //Labels (textos sueltos)  
    private Container _contenedor; //El contenedor del JFrame
    
    public cBinario () //Constructor
    {
        configVentana(); //Establece las características de la ventana
        muestraComponentes(); //Inicializa todas las variables (botones, cajas de texto y labels)
        this._ventana.setVisible(true); //Hace visible la ventana
    }
    
    public void configVentana()
    {
        _ventana = new JFrame();
        _ventana.setSize(800, 650); //Tamaño
        _ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _ventana.setLocationRelativeTo(null); //Centrada
        _ventana.setLayout(null);
        _ventana.setResizable(false); //No redimensionable
        _contenedor = _ventana.getContentPane();  
        _contenedor.setBackground(Color.BLUE);
    }
    
    public void muestraComponentes()
    {
        _binarioBtn = new JButton("De binario a decimal"); //Para ejecutar el cambio de binario a decimal
        _binarioBtn.setBounds(100, 300, 250, 100);  
        _binarioBtn.setBackground(Color.YELLOW);
        _binarioBtn.setForeground(Color.RED);
        _binarioBtn.setFont(new Font("Tahoma", 1, 20));
        _contenedor.add(_binarioBtn);
        _binarioBtn.addActionListener(this);
        _binarioBtn.setVisible(true);        
        
        _decimalBtn = new JButton("De decimal a binario"); //Para ejecutar el cambio de decimal a binario
        _decimalBtn.setBounds(450, 300, 250, 100);  
        _decimalBtn.setBackground(Color.RED);
        _decimalBtn.setForeground(Color.YELLOW);
        _decimalBtn.setFont(new Font("Tahoma", 1, 20));
        _contenedor.add(_decimalBtn);
        _decimalBtn.addActionListener(this);
        _decimalBtn.setVisible(true);
        
        _calcular1 = new JButton("Calcular"); //Calcula el número decimal a partir de uno binario
        _calcular1.setBounds(550, 300, 170, 75);
        _calcular1.setBackground(Color.RED);
        _calcular1.setForeground(Color.YELLOW);
        _calcular1.setFont(new Font("Comic Sans", 1, 15));
        _contenedor.add(_calcular1);
        _calcular1.addActionListener(this);
        _calcular1.setVisible(false);
        
        _calcular2 = new JButton("Calcular"); //Calcula el número binario a partir de uno decimal
        _calcular2.setBounds(550, 300, 170, 75);
        _calcular2.setBackground(Color.YELLOW);
        _calcular2.setForeground(Color.RED);
        _calcular2.setFont(new Font("Comic Sans", 1, 11));
        _contenedor.add(_calcular2);
        _calcular2.addActionListener(this);
        _calcular2.setVisible(false);
        
        _regresar = new JButton("Regresar"); //Regresa al menú principal
        _regresar.setBounds(400, 530, 150, 60);  
        _regresar.setBackground(Color.CYAN);
        _regresar.setForeground(Color.BLACK);
        _regresar.setFont(new Font("Arial", 1, 11));
        _contenedor.add(_regresar);
        _regresar.addActionListener(this);
        _regresar.setVisible(false);
        
        _salir = new JButton("Salir"); //Terminar el programa
        _salir.setBounds(600, 530, 150, 60);  
        _salir.setBackground(Color.MAGENTA);
        _salir.setForeground(Color.RED);
        _salir.setFont(new Font("Calibri", 1, 20));
        _contenedor.add(_salir);
        _salir.addActionListener(this);
        _salir.setVisible(true);
        
        _binarioTxt1 = new JTextField(); //Para ingresar un número binario
        _binarioTxt1.setBounds(100, 300, 400, 30);
        _contenedor.add(_binarioTxt1);
        _binarioTxt1.setVisible(false);
        
        _decimalTxt1 = new JTextField(); //Para ingresar un número decimal
        _decimalTxt1.setBounds(100, 300, 400, 30);
        _contenedor.add(_decimalTxt1);
        _decimalTxt1.setVisible(false);
        
        _binarioTxt2 = new JTextField(); //Devuelve un número decimal a partir del binario
        _binarioTxt2.setBounds(100, 350, 400, 30);
        _contenedor.add(_binarioTxt2);
        _binarioTxt2.setVisible(false);
        _binarioTxt2.setEditable(false);
        
        _decimalTxt2 = new JTextField(); //Devuelve un número binario a partir del decimal
        _decimalTxt2.setBounds(100, 350, 400, 30);
        _contenedor.add(_decimalTxt2);
        _decimalTxt2.setVisible(false);
        _decimalTxt2.setEditable(false);
        
        _titulo = new JLabel("Convertidor de binario a decimal (y viceversa)");
        _titulo.setBounds(100, 50, 700, 50);
        _titulo.setFont(new Font("Times New Roman", 1, 32));
        _titulo.setForeground(Color.GREEN);
        _contenedor.add(_titulo);
        _titulo.setVisible(true);
        
        _subtitulo = new JLabel("Elija el sistema que quiere convertir");
        _subtitulo.setBounds(200, 100, 500, 50);
        _subtitulo.setFont(new Font("Verdana", 1, 18));
        _subtitulo.setForeground(Color.ORANGE);
        _contenedor.add(_subtitulo);
        _subtitulo.setVisible(true);
        
        _binarioLbl = new JLabel("De binario a decimal");
        _binarioLbl.setBounds(200, 50, 500, 50);
        _binarioLbl.setFont(new Font("Lucila", 1, 40));
        _binarioLbl.setForeground(Color.ORANGE);
        _contenedor.add(_binarioLbl);
        _binarioLbl.setVisible(false);
        
        _decimalLbl = new JLabel("De decimal a binario");
        _decimalLbl.setBounds(200, 50, 500, 50);
        _decimalLbl.setFont(new Font("Lucila", 1, 40));
        _decimalLbl.setForeground(Color.RED);
        _contenedor.add(_decimalLbl);
        _decimalLbl.setVisible(false);
        
        _label1 = new JLabel("Ingrese en el 1° cuadro un número binario, y en el 2° aparecerá su notación decimal.");
        _label1.setBounds(100, 220, 600, 50);
        _label1.setFont(new Font("Cambria", 1, 12));
        _label1.setForeground(Color.GREEN);
        _contenedor.add(_label1);
        _label1.setVisible(false);
        
        _label2 = new JLabel("Ingrese en el 1° cuadro un número decimal, y en el 2° aparecerá su notación binaria.");
        _label2.setBounds(100, 220, 600, 50);
        _label2.setFont(new Font("Cambria", 1, 12));
        _label2.setForeground(Color.GREEN);
        _contenedor.add(_label2);
        _label2.setVisible(false);
       
        _aviso1 = new JLabel("*Nota: Sólo puede ingresar los dígitos 0 ó 1. De lo contrario, el programa no funcionará.");
        _aviso1.setBounds(100, 400, 600, 50);
        _aviso1.setFont(new Font("Century Gothic", 1, 12));
        _aviso1.setForeground(Color.MAGENTA);
        _contenedor.add(_aviso1);
        _aviso1.setVisible(false);
        
        _aviso2 = new JLabel("*Nota: Sólo puede ingresar dígitos. De lo contrario, el programa no funcionará");
        _aviso2.setBounds(100, 400, 600, 50);
        _aviso2.setFont(new Font("Century Gothic", 1, 12));
        _aviso2.setForeground(Color.MAGENTA);
        _contenedor.add(_aviso2);
        _aviso2.setVisible(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == _binarioBtn)
        {
            _binarioBtn.setVisible(false);
            _decimalBtn.setVisible(false);
            _calcular1.setVisible(true);            
            _regresar.setVisible(true);
            _binarioTxt1.setVisible(true);
            _binarioTxt2.setVisible(true);
            _titulo.setVisible(false);
            _subtitulo.setVisible(false);
            _binarioLbl.setVisible(true);
            _label1.setVisible(true);
            _aviso1.setVisible(true);            
        }
        else
        {
            if (e.getSource() == _decimalBtn)
            {
                _binarioBtn.setVisible(false);
                _decimalBtn.setVisible(false);                
                _calcular2.setVisible(true);
                _regresar.setVisible(true);
                _decimalTxt1.setVisible(true);
                _decimalTxt2.setVisible(true);
                _titulo.setVisible(false);
                _subtitulo.setVisible(false);
                _decimalLbl.setVisible(true); 
                _label2.setVisible(true);
                _aviso2.setVisible(true);
            }
            else
            {
                if (e.getSource() == _calcular1)
                {
                    if (!_binarioTxt1.getText().isEmpty()) //Valida que el campo no esté vacío
                    {
                        try
                        {
                            String cadBinaria = _binarioTxt1.getText(); //Toma el valor del cuadro de texto (la cadena del número binario)
                            boolean bienBinario = true; //Variable booleana para validar si es verdad que el número es binario
                            for (int i = 0; i<cadBinaria.length(); i++)
                            {
                                if (cadBinaria.charAt(i) != '0' && cadBinaria.charAt(i) != '1') //Verifica si el caracter es 0 ó 1, si no, el booleano se vuelve falso
                                {
                                    bienBinario = false;
                                }
                            }
                            if (bienBinario == true) //Si se ha validado que el número es binario
                            {                         
                                String binario = ""; //Variable que guardará la cadena inversa para poder realizar la conversión
                                for (int i = cadBinaria.length()-1; i>=0; i--) //Voltea la cadena original
                                {
                                    binario += cadBinaria.charAt(i);
                                }                               
                                int resultado = 0;
                                for (int i = 0; i<binario.length(); i++) //Toma el número en una posición y lo multiplica por 2 elevado a dicha posición
                                {
                                    resultado += ((Integer.parseInt(String.valueOf(binario.charAt(i)))) * (Math.pow(2, i)));
                                }
                                _binarioTxt2.setText(String.valueOf(resultado)); //Despliega el resultado
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "Sólo puedes ingresar los dígitos '0' y '1'.");
                            }
                        }   
                        catch (Exception ex)
                        {
                            JOptionPane.showMessageDialog(this, "Sólo puedes ingresar los dígitos '0' y '1'.");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Ingresa un número binario.");
                    }
                }
                else
                {
                    if (e.getSource() == _calcular2)
                    {
                        if (!_decimalTxt1.getText().isEmpty())
                        {
                            try
                            {
                                String resultado = ""; //Variable que guardará la cadena invertida
                                int cadDecimal = Integer.parseInt(_decimalTxt1.getText()); //Toma el valor del cuadro de texto (la cadena del número decimal)
                                String texto = String.valueOf(cadDecimal); 
                                boolean bienDecimal = true; //Variable booleana para validar si es verdad que es un número
                                for (int i = 0; i<texto.length(); i++)
                                {
                                    if (texto.charAt(i) != '0' && texto.charAt(i) != '1' & texto.charAt(i) != '2' & texto.charAt(i) != '3' & texto.charAt(i) != '4' & texto.charAt(i) != '5' & texto.charAt(i) != '6' & texto.charAt(i) != '7' & texto.charAt(i) != '8' & texto.charAt(i) != '9') //Verifica si el caracter es un dígito, si no, el booleano se vuelve falso
                                    {
                                        bienDecimal = false;
                                    }
                                }
                                if (bienDecimal == true) //Si se ha validado que es un número
                                { 
                                    while (cadDecimal > 0) //Divisiones sucesivas entren 2, y agrega el residuo a la cadena                                
                                    {                                    
                                        if (cadDecimal%2 == 0)
                                        {
                                            resultado += 0;
                                        }
                                        else
                                        {
                                            resultado += 1;                                        
                                        } 
                                        cadDecimal = cadDecimal/2; //Divide entre 2 para continuar el proceso
                                    }                                
                                    String decimal = ""; //Variable que guardará la cadena ya invertida para poder realizar la conversión
                                    for (int i = resultado.length()-1; i>=0; i--) //Voltea la cadena original
                                    {
                                        decimal += resultado.charAt(i);
                                    }
                                    _decimalTxt2.setText(String.valueOf(decimal)); //Despliega el resultado
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(this, "Sólo puedes ingresar dígitos del 0 al 9.");
                                }
                            }   
                            catch (Exception ex)
                            {
                                JOptionPane.showMessageDialog(this, "Sólo puedes ingresar dígitos del 0 al 9.");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Ingresa un número.");
                        }
                    }
                    else
                    {
                        if (e.getSource() == _regresar)
                        {
                            _binarioBtn.setVisible(true);
                            _decimalBtn.setVisible(true);
                            _calcular1.setVisible(false);
                            _calcular2.setVisible(false);
                            _regresar.setVisible(false);
                            _binarioTxt1.setVisible(false);
                            _binarioTxt2.setVisible(false);
                            _decimalTxt1.setVisible(false);
                            _decimalTxt2.setVisible(false);
                            _binarioTxt1.setText(null);
                            _binarioTxt2.setText(null);
                            _decimalTxt1.setText(null);
                            _decimalTxt2.setText(null);
                            _titulo.setVisible(true);
                            _subtitulo.setVisible(true);
                            _binarioLbl.setVisible(false);
                            _decimalLbl.setVisible(false);
                            _aviso1.setVisible(false);
                            _aviso2.setVisible(false);
                            _label1.setVisible(false);
                            _label2.setVisible(false);
                        }
                        else
                        {
                            if (e.getSource() == _salir)
                            {
                                JOptionPane.showMessageDialog(this, "¡Gracias por usar este programa!");
                                System.exit(0);
                            }              
                        }
                    }
                }
            }
        }
    }
}
