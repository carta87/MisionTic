// See https://aka.ms/new-console-template for more information
namespace HolaMundo{
    class Program{

        static void Main (string []arg){

            bool control = true;
            while (control)
            {
                System.Console.Write("=== Pratica de sentencia Siwtch");
                System.Console.WriteLine("Elige la opcion que desees ejecutar");
                System.Console.WriteLine("1. Ejercicio No 1: suma dos numeros");
                System.Console.WriteLine("2. Ejercicio No 2: Obtener el perimetro de cuadrado ");
                System.Console.WriteLine("3. Ejercicio No 3  Obtener la suma de varios numeros");
                System.Console.WriteLine("4. Ejercicio No 4: Obtener promedio de 4 numeros ");
                System.Console.WriteLine("5. Ejercicio No 5: calcular valor total producto");
                System.Console.WriteLine("6. salir");
                System.Console.WriteLine("Digite una opcion del menu:");
                int opcion = Convert.ToInt32(Console.ReadLine());
                String respuesta = "";
                

                switch (opcion)
                {
                    case 1:
                        System.Console.WriteLine("primer numero");
                        int num1 =  Convert.ToInt32(Console.ReadLine());
                        System.Console.WriteLine("Segundo numero");
                        int num2 =  Convert.ToInt32(Console.ReadLine());
                        System.Console.WriteLine("la suma de " + num1 + " + " + num2 +" es " + (num1+num2));
                        


                    break;

                    case 2:
                       System.Console.WriteLine("Ingrese la medida de un lado  del cuadrado ");
                       int lado =  Convert.ToInt32(Console.ReadLine());
                       int result = lado*4;
                       System.Console.WriteLine("El perimetro del cuadrado ingresado es: "+ result);
                    break;

                    case 3:
                        System.Console.WriteLine("primer numero:");
                        int numEntt1 =  Convert.ToInt32(Console.ReadLine());
                        System.Console.WriteLine("Segundo numero:");
                        int numEntt2 =  Convert.ToInt32(Console.ReadLine());
                        System.Console.WriteLine("Tercer numero:");
                        int numEntt3 =  Convert.ToInt32(Console.ReadLine());
                        System.Console.WriteLine("cuarto numero:");
                        int numEntt4 =  Convert.ToInt32(Console.ReadLine());
                        System.Console.WriteLine("la suma de los dos primeros nuemeros es  "+ (numEntt1+numEntt2));
                        System.Console.WriteLine("la suma de los tres promeros nuemeros es "+ (numEntt1+numEntt2+numEntt3));
                        System.Console.WriteLine("la suma de los nuemeros ingresados es    "+ (numEntt1+numEntt2+numEntt3+numEntt4));
                    break;

                    case 4:
                        System.Console.WriteLine("primer numero:");
                        int numEnt1 =  Convert.ToInt32(Console.ReadLine());
                        System.Console.WriteLine("Segundo numero:");
                        int numEnt2 =  Convert.ToInt32(Console.ReadLine());
                        System.Console.WriteLine("Tercer numero:");
                        int numEnt3 =  Convert.ToInt32(Console.ReadLine());
                        System.Console.WriteLine("cuarto numero:");
                        int numEnt4 =  Convert.ToInt32(Console.ReadLine());
                        int resul = numEnt1 + numEnt2 + numEnt3 + numEnt4;
                        System.Console.WriteLine("el promedio de los 4 valores numericos es: "+ resul/4);
                        break;

                    case 5:/*
                        do
                        {
                        System.Console.WriteLine("Ingrese la el valor de producto:");
                        int prodValor =  Convert.ToInt32(Console.ReadLine());
                        System.Console.WriteLine("Ingrese la cantidad: ");
                        int prodCant =  Convert.ToInt32(Console.ReadLine());
                        int valorTotal = prodCant* prodValor;
                        System.Console.WriteLine("Valor total de producto: "+ valorTotal);
                        System.WriteLine("Desea continuar si - no");
                        //respuesta = Console.ReadLine();
                        break;
                            
                        } while (respuesta == "no");
                           */

                    case 6: 
                     System.Console.WriteLine("gracias por usar nuestro programa");
                     control= false;
                     break;

                    default:
                     System.Console.WriteLine("ha seleccionado una opcion invalida");
                     break;

                }
                
            }

           /* Console.WriteLine("Hello, World!");

            //metodos de conversion 
            System.Console.WriteLine("Ingrese el numero a sumar");
            int n5 = Convert.ToInt32( Console.ReadLine());
            System.Console.WriteLine(n5+3);*/

        }
    }

    

}
