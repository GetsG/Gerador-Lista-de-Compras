package styles;

public class Css {
	
	private String style = "<!DOCTYPE html>\r\n"
			+ "<html lang=\"pt-BR\">\r\n"
			+ "  <head>\r\n"
			+ "    <meta charset=\"UTF-8\" />\r\n"
			+ "    <title>Lista de Compras</title>\r\n"
			+ "    <style>\r\n"
			+ "      body {\r\n"
			+ "        font-family: Arial, sans-serif;\r\n"
			+ "        background: #f1f1f1;\r\n"
			+ "        padding: 40px;\r\n"
			+ "      }\r\n"
			+ "\r\n"
			+ "      .lista-container {\r\n"
			+ "        background: #fff;\r\n"
			+ "        max-width: 800px;\r\n"
			+ "        margin: 0 auto;\r\n"
			+ "        padding: 20px;\r\n"
			+ "        border-radius: 12px;\r\n"
			+ "        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);\r\n"
			+ "      }\r\n"
			+ "\r\n"
			+ "      h2 {\r\n"
			+ "        text-align: center;\r\n"
			+ "        color: #4caf50;\r\n"
			+ "      }\r\n"
			+ "\r\n"
			+ "      ul {\r\n"
			+ "        list-style-type: none;\r\n"
			+ "        padding: 0;\r\n"
			+ "      }\r\n"
			+ "\r\n"
			+ "      li {\r\n"
			+ "        padding: 10px;\r\n"
			+ "        margin-bottom: 8px;\r\n"
			+ "        background-color: #e8f5e9;\r\n"
			+ "        border-left: 5px solid #4caf50;\r\n"
			+ "        border-radius: 6px;\r\n"
			+ "        transition: transform 0.2s;\r\n"
			+ "      }\r\n"
			+ "\r\n"
			+ "      li:hover {\r\n"
			+ "        transform: scale(1.03);\r\n"
			+ "        background-color: #c8e6c9;\r\n"
			+ "      }\r\n"
			+ "    </style>\r\n"
			+ "\r";
	
	public Css() {
	}

	public String getStyle() {
		return style;
	}

	
	
}
