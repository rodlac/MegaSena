package models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BancoMegaSena {
	private static BancoMegaSena instance;
	private List<Concurso> concursos;

	public static BancoMegaSena getInstance() throws IOException {
		if (instance == null)
			instance = new BancoMegaSena();
		return instance;
	}

	public void addConcurso(Concurso c) {
		this.concursos.add(c);
	}

	private BancoMegaSena() throws IOException {
		this.concursos = new ArrayList<Concurso>();

		File input = new File(
				"C:\\Users\\Rodrigo Lacerda\\Downloads\\D_mgsasc (1)\\d_megasc.htm");

		Document doc = Jsoup.parse(input, "UTF-8");
		Elements trs = doc.getElementsByTag("tr");
		System.out.println(trs.get(1).getElementsByTag("th"));

		for (Element tr : trs)
			if (tr.getElementsByTag("th").isEmpty()) {
				String codigo = tr.getElementsByTag("td").get(0).text();
				String d1 = tr.getElementsByTag("td").get(2).text();
				String d2 = tr.getElementsByTag("td").get(3).text();
				String d3 = tr.getElementsByTag("td").get(4).text();
				String d4 = tr.getElementsByTag("td").get(5).text();
				String d5 = tr.getElementsByTag("td").get(6).text();
				String d6 = tr.getElementsByTag("td").get(7).text();
				boolean acumulado = tr.getElementsByTag("td").get(15).text()
						.equals("SIM");

				Concurso concurso = new Concurso(Integer.parseInt(codigo));
				concurso.addNumero(Integer.parseInt(d1));
				concurso.addNumero(Integer.parseInt(d2));
				concurso.addNumero(Integer.parseInt(d3));
				concurso.addNumero(Integer.parseInt(d4));
				concurso.addNumero(Integer.parseInt(d5));
				concurso.addNumero(Integer.parseInt(d6));
				concurso.setAcumulado(acumulado);

				this.concursos.add(concurso);
			}
	}

	public Iterator<Concurso> iterator() {
		return this.concursos.iterator();
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * models.BancoMegaSena JD-Core Version: 0.6.2
 */