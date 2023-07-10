package persistencia;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;

import negocio.Carta;

public class DequeCartas {

	private ArrayList<Carta> cartas;
	
	public DequeCartas() {
		this.cartas = new ArrayList<Carta>();
		
        String diretorio = "./cartas";

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(diretorio))) {
            for (Path arquivo : stream) {
                if (Files.isRegularFile(arquivo)) {
                	String caminho = "./cartas/" + arquivo.getFileName();
                	
                    this.cartas.add(new Carta(caminho));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public Carta getCarta(int id) {
		return this.cartas.get(id);
	}
	
	public static void main(String[] args) {
		System.out.println((new DequeCartas()).getCarta(0));
		
	}
	
}
