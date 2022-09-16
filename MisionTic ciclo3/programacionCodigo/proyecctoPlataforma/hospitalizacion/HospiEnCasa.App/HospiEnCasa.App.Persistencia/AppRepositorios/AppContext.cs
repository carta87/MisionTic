using Microsoft.EntityFrameworkCore;
using HospiEncasa.App.Dominio;


namespace HospiEnCasa.App.Persistencia
{
    public class AppContext : DbContext
    {
        public DbSet<Persona> Personas { get; set; }
        public DbSet<Enfermera> Enfermeras { get; set; }
        public DbSet<FamiliarDesignado> Familiar { get; set; }
        public DbSet<Historia> Hitorias { get; set; }
        public DbSet<Medico> Medicos { get; set; }
        public DbSet<Paciente> Pacientes { get; set; }
        public DbSet<SignoVital> SignoVitales { get; set; }
        public DbSet<SugerenciaCuidado> Sugerencias { get; set; }
        

        
    //metodo para la conexion
    protected override void OnConfiguring (DbContextOptionsBuilder optionsBuilder)
    {

        if (!optionsBuilder.IsConfigured)
        {
            optionsBuilder
            .UseSqlServer("Data Source = (localdb)\\MSSQLLocalDB; Initial Catalog = HospiEnCasaDataCurso");
        }

    }

    }

}