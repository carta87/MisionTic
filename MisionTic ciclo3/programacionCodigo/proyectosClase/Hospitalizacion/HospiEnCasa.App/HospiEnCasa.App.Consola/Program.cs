using System;
using HospiEnCasa.App.Dominio;
using HospiEnCasa.App.Persistencia;

namespace HospiEnCasa.App.Consola
{
    class Program
    {
        //creamos un campo o atributo de clase llamado _repoPaciente
        private static IRepositorioPaciente _repoPaciente = new ReposopitorioPaciente(new Persistencia.AppContext());

        static void Main(string[] args)
        {
            
            bool control = true;
            while (true)
            {
                System.Console.WriteLine("### Bienvenido al programa Hospital en casa Grupo 07 ###");
                System.Console.WriteLine("            ### CRUD  PACIENTES  ####                   ");
                System.Console.WriteLine();
                System.Console.WriteLine("1. Adicionar Paciente ");
                System.Console.WriteLine("2. Borrar Paciente ");
                System.Console.WriteLine("3. Asignar  Medico ");
                int opcion = Convert.ToInt32(Console.ReadLine());

                switch (opcion)
                {
                    case 1:
                        AddPAciente();
                        break;
                    case 2:
                        System.Console.WriteLine("metodo para borrar paciente");
                        BorrarPaciente(2);
                        break;
                    case 3:
                        System.Console.WriteLine("medtodo para asignar medico");
                        //AsignarMedico();  
                        break;

                    case 4:
                        
                        System.Console.WriteLine("gracias por usar la aplicacion hspi en casa");
                        control = false;
                        break;
                    default:
                        System.Console.WriteLine("opcion Incorecta, digite nuevamente");
                        break;
                }


            }


        }

        private static void AddPAciente()
        {
            var paciente = new Paciente
            {
                Nombre = "Pepito",
                Apellidos = "Perez",
                Genero = Genero.Masculino,
                NumeroTelefono = "122333",
                Direccion = "la playa",
                Latitud = 5.888F,
                Longitud = 556.333F,
                Ciudad = "Bogota",
                FechaNacimiento = new DateTime(1994, 12, 14)
            };
            _repoPaciente.AddPaciente(paciente);
            System.Console.WriteLine($"El paciente {paciente.Nombre} {paciente.Apellidos} ha sido Agregado con exito");

        }

        private static void BorrarPaciente(int idPaciente)
        {
            _repoPaciente.DeletePaciente(idPaciente);
            System.Console.WriteLine("PAciente elininado con exito");

        }


    }
}
