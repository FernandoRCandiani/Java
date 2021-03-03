package AtividadePOO;

public class Aviaoteste {
		private String tipoAviao;
		private String tipoEmpresa;
		private String localViagem;
		private String horario;
	
		public Aviaoteste (String tipoAviao, String tipoEmpresa, String localViagem, String horario) {
			this.tipoAviao=tipoAviao;
			this.tipoEmpresa=tipoEmpresa;
			this.localViagem=localViagem;
			this.horario=horario;
		
		}
		public void Informacao () {
			System.out.println("Qual Avião? "+tipoAviao+"\nEm qual das empresa? "+tipoEmpresa+"\nEm qual lugar "
					+"vai ser a viagem para "+localViagem+"\nQual é horario da viagem? "+horario);
	}
		public String getTipoAviao() {
			return tipoAviao;
		}
		public void setTipoAviao(String tipoAviao) {
			this.tipoAviao = tipoAviao;
		}
		public String getTipoEmpresa() {
			return tipoEmpresa;
		}
		public void setTipoEmpresa(String tipoEmpresa) {
			this.tipoEmpresa = tipoEmpresa;
		}
		public String getLocalViagem() {
			return localViagem;
		}
		public void setLocalViagem(String localViagem) {
			this.localViagem = localViagem;
		}
		public String getHorario() {
			return horario;
		}
		public void setHorario(String horario) {
			this.horario = horario;
		}
	
	
}