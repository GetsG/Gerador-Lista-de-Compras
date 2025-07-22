package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import styles.Css;
import styles.Html;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Css css = new Css();
		Html html = new Html();
		List<Produto> pd = new ArrayList<>();
		String produto = "";
		
		while(!produto.equals("fim")) {
		
		produto = sc.next();
		if(!produto.equals("fim")){
			pd.add(new Produto(produto));
		}
		else {
			break;
		}}
		
		String caminho = "C:\\Users\\Gets\\Desktop\\Leitura Arquivos\\ListaDeCompras.html";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
			
			bw.write(css.getStyle());
			bw.write(html.getHtml());
			
			for(Produto prod: pd) {
				bw.write("      	<li>" + prod.getNome() + "</li>\r\n");
			}
			
			bw.write(html.getHtml1());
				
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		sc.close();
	}

}
