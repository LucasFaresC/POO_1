
public class Conta{
    float a;
    float b;
    

    public float divisao() throws DivPorZeroException{
        
        boolean estado = true;
        
        while(estado){
            try{

            }catch(DivPorZeroException dpze){

            }finally{
                return a/b;
        } 
        }

    public float somar(){
        return a+b
    }

    public float multiplicar(){
        return a*b;
    }

    public float subtracao(){
        return a-b;
    }

    public float getA(){
        return a;
    }

    public float getB(){
        return b;
    }
    
    public void setA(float a){
        this.a = a;
    }

    public void setB(float b){
        this.b = b;
    }

}