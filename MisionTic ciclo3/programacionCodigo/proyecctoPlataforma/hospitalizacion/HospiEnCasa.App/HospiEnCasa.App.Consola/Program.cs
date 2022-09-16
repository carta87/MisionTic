using System;
using HospiEnCasa.App.Persistencia;
using HospiEncasa.App.Dominio;


namespace HospiEnCasa.App.Consola
{
    class Program
    {
        private static IRepositorioPaciente _repoPaciente = new ReposopitorioPaciente(new Persistencia.AppContext());
        static void Main(string[] args)
        {
            System.Console.WriteLine("hola desde proyecto consola");
            AddPaciente();
            //BuscarPaciente(5);
            System.Console.WriteLine(" proyecto consola");
        }

        private static void AddPaciente(){
            var paciente = new Paciente{
                Nombre = "carlos", 
                Apellidos = "Tafur",
                NumeroTelefono = "3213444",
                Genero = Genero.Masculino,
                Direccion = "Calle 70 sur no. 18n h 49",
                Longitud = 5.0003F,
                Latitud = 76.000F,
                Ciudad = "bogota",
                FechaNacimiento = new DateTime(2022, 08, 12)
            };
            _repoPaciente.AddPaciente(paciente);
        }


        

        private static void BuscarPaciente (int idPaciente){

            try
            {
                var paciente = _repoPaciente.GetPaciente(idPaciente);
                Console.WriteLine(paciente.Nombre);
            }
            catch (System.Exception)
            {
                
                Console.WriteLine("paciente.Nombre no se logro recuperar");
                throw;
            }
            
        }
    }
}
