using System.Collections.Generic;
using System.Linq;
using HospiEnCasa.App.Dominio;


namespace HospiEnCasa.App.Persistencia
{
    public class ReposopitorioPaciente : IRepositorioPaciente
    {
        private readonly AppContext _appContext;

        public ReposopitorioPaciente(AppContext appContext){
            _appContext = appContext;
        }

        Paciente IRepositorioPaciente.AddPaciente(Paciente paciente){
            var pacienteAdicionado = _appContext.Pacientes.Add(paciente);
            _appContext.SaveChanges();
            return pacienteAdicionado.Entity;
        }

        //este metodo permitira eliminar pacientes
        void IRepositorioPaciente.DeletePaciente(int idPaciente)
        {
            var pacienteEncontrado = _appContext.Pacientes.FirstOrDefault(p => p.Id == idPaciente);
            if(pacienteEncontrado != null)
            {
              _appContext.Pacientes.Remove(pacienteEncontrado);
              _appContext.SaveChanges();
            }else
            {  
                System.Console.WriteLine("no se logro eliminar");
                return;
            }
        }

        IEnumerable<Paciente> IRepositorioPaciente.GetAllPacientes()
        {
            return _appContext.Pacientes;
        }

        Paciente IRepositorioPaciente.GetPaciente(int idPaciente)
        {
            return _appContext
                  .Pacientes
                  .FirstOrDefault(p => p.Id == idPaciente);
        }

        Paciente IRepositorioPaciente.UpdatePaciente(Paciente paciente)
        {
            var pacienteEncontrado =
                _appContext.Pacientes.FirstOrDefault(p => p.Id == paciente.Id);
                if(pacienteEncontrado != null)
                {
                pacienteEncontrado.Nombre = paciente.Nombre;
                pacienteEncontrado.Apellidos = paciente.Apellidos;
                pacienteEncontrado.NumeroTelefono = paciente.NumeroTelefono;
                pacienteEncontrado.Direccion = paciente.Direccion;
                pacienteEncontrado.Genero = paciente.Genero;
                pacienteEncontrado.Latitud = paciente.Latitud;
                pacienteEncontrado.Ciudad = paciente.Ciudad;
                pacienteEncontrado.FechaNacimiento = paciente.FechaNacimiento;
                pacienteEncontrado.FamiliarDesignado = paciente.FamiliarDesignado;
                pacienteEncontrado.Enfermera = paciente.Enfermera;
                pacienteEncontrado.Medico = paciente.Medico;
                pacienteEncontrado.Historia = paciente.Historia;

                _appContext.SaveChanges();
                }
                return pacienteEncontrado;
        }

        Medico IRepositorioPaciente.AsignarMedico(int idPaciente, int idMedico)
        {
            var pacienteEncontrado = _appContext.Pacientes.FirstOrDefault(p => p.Id == idPaciente );
            if(pacienteEncontrado != null)
            {
               var medicoEncontrado = _appContext.Medicos.FirstOrDefault(m => m.Id == idMedico);
               if(medicoEncontrado != null)
               { 
                 pacienteEncontrado.Medico = medicoEncontrado;
                 _appContext.SaveChanges();
               }
               return medicoEncontrado;
            }
            return null;
        }

    }
}