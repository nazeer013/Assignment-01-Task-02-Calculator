package pk.edu.pucit.calculator;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;
        import android.view.View;

        import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {
    TextView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn00,btnAc,btnDel,btnDiv,btnAdd,btnSub,btnMul,btnEq,btnPer,btnDot,equ,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (TextView) findViewById(R.id.one);
        btn2 = (TextView) findViewById(R.id.two);
        btn3 = (TextView) findViewById(R.id.three);
        btn4 = (TextView) findViewById(R.id.four);
        btn5 = (TextView) findViewById(R.id.five);
        btn6 = (TextView) findViewById(R.id.six);
        btn7 = (TextView) findViewById(R.id.seven);
        btn8 = (TextView) findViewById(R.id.eight);
        btn9 = (TextView) findViewById(R.id.nine);
        btn0 = (TextView) findViewById(R.id.zero);

        btnAc = (TextView) findViewById(R.id.ac);
        btnDel = (TextView) findViewById(R.id.del);
        btnDiv = (TextView) findViewById(R.id.div);
        btnAdd = (TextView) findViewById(R.id.add);
        btnMul = (TextView) findViewById(R.id.mul);
        btnSub = (TextView) findViewById(R.id.sub);

        btnEq = (TextView) findViewById(R.id.eq);

        equ = (TextView) findViewById(R.id.tv_equation);
        res = (TextView) findViewById(R.id.tv_result);
    }
    public void onClick(View view){
        String str=((TextView)view).getText().toString();
        String eq=String.valueOf(equ.getText());
        int length=eq.length();
    }
    public void ac(View view){
        equ.setText("");
        res.setText("");
    }
    public void equate(View view) {
        String eq=String.valueOf(equ.getText());
        Expression e= new Expression(eq);
        String result=String.valueOf(e.calculate());
        res.setText(result);
    }
    public void del(View view){
        String eq=String.valueOf(equ.getText());
        if(equ.length()>0){
            equ.setText(eq.substring(0,eq.length()-1));
        }
    }
    public void one(View v){
        String eq=String.valueOf(equ.getText());
        equ.setText(eq.concat("1"));
    }
    public void two(View v){
        String eq=String.valueOf(equ.getText());
        equ.setText(eq.concat("2"));
    }
    public void three(View v){
        String eq=String.valueOf(equ.getText());
        equ.setText(eq.concat("3"));
    }
    public void four(View v){
        String eq=String.valueOf(equ.getText());
        equ.setText(eq.concat("4"));
    }
    public void five(View v){
        String eq=String.valueOf(equ.getText());
        equ.setText(eq.concat("5"));
    }
    public void six(View v){
        String eq=String.valueOf(equ.getText());
        equ.setText(eq.concat("6"));
    }
    public void seven(View v){
        String eq=String.valueOf(equ.getText());
        equ.setText(eq.concat("7"));
    }
    public void eight(View v) {
        String eq = String.valueOf(equ.getText());
        equ.setText(eq.concat("8"));
    }
    public void nine(View v){
        String eq=String.valueOf(equ.getText());
        equ.setText(eq.concat("9"));
    }
    public void zero(View v){
        String eq=String.valueOf(equ.getText());
        if(equ.length()>0)
            equ.setText(eq.concat("0"));
    }
    public void minus(View v){
        String eq=String.valueOf(equ.getText());
        char ope=eq.charAt(eq.length()-1);
        if(equ.length()>0){
            equ.setText((eq.concat("-")));
        }
        else if(ope=='+'||ope=='-'||ope=='*'||ope=='/'){
            equ.setText((eq));
        }
    }
    public void plus(View v){
        String eq=String.valueOf(equ.getText());
        char ope=eq.charAt(eq.length()-1);
        if(equ.length()>0){
            equ.setText((eq.concat("+")));
        }
        else if(ope=='+'||ope=='-'||ope=='*'||ope=='/'){
            equ.setText((eq));
        }
    }
    public void multiply(View v){
        String eq=String.valueOf(equ.getText());
        char ope=eq.charAt(eq.length()-1);
        if(equ.length()>0){
            equ.setText((eq.concat("*")));
        }
        else if(ope=='+'||ope=='-'||ope=='*'||ope=='/'){
            equ.setText((eq));
        }
    }
    public void divide(View v){
        String eq=String.valueOf(equ.getText());
        char ope=eq.charAt(eq.length()-1);
        if(equ.length()>0){
            equ.setText((eq.concat("/")));
        }
        else if(ope=='+'||ope=='-'||ope=='*'||ope=='/'){
            equ.setText((eq));
        }
    }
}
