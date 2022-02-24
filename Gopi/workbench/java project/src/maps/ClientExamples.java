package maps;

public class ClientExamples implements Comparable<ClientExamples> {
	
	private Integer clientId;
	private  String clientName;
	private Integer clientAge;
	
	
	
	
	
	public ClientExamples(Integer clientId, String clientName, Integer clientAge) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.clientAge = clientAge;
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Integer getClientAge() {
		return clientAge;
	}
	public void setClientAge(Integer clientAge) {
		this.clientAge = clientAge;
	}
	@Override
	public String toString() {
		return "ClientExamples [clientId=" + clientId + ", clientName=" + clientName + ", clientAge=" + clientAge + "]";
	}
	@Override
	public int compareTo(ClientExamples o) {
		
		return clientId.compareTo(o.getClientId());
	}
	
	
	
	
}
