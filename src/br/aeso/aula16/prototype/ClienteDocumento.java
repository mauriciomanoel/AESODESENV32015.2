package br.aeso.aula16.prototype;
public class ClienteDocumento {
	public static void main(String[] args) {
		Documento pdf = new PDF();
		Documento ascii = new ASCII();
		pdf.setFormato("A5");
		Documento pdfFormatado = pdf.clone();
		pdfFormatado.setFormato("A4");
		
		System.out.println(pdf.getFormato());
		System.out.println(pdfFormatado.getFormato());
	}

}
