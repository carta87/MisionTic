namespace Entidades 
{
    public class Cliente : Persona
    {
        public int Id { get; set; }
        public string TipoCliente { get; set; }
        public string Dirrecion { get; set; }
        
        public GrupoEdad  GrupoEdad { get; set; }

        public TipoSexo TipoSexo { get; set; }
    }
}