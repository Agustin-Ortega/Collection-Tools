package Singleton;

public class Singleton {

	 private String url;
	    private String baseDeDatos;
	    private double random;
	    private static Singleton miConfigurador;



	    public static Singleton getConfigurador(String url, String baseDeDatos)
	    {
	        if (miConfigurador == null)
	        {
	            miConfigurador = new Singleton(url, baseDeDatos);
	        }
	        return miConfigurador;
	    }


	    private Singleton(String url, String baseDeDatos)
	    {
	        setBaseDeDatos(baseDeDatos);
	        setUrl(url);
	        setRandom(Math.random());
	    }


	    public void setUrl(String url) {
	        this.url = url;
	    }

	    public void setBaseDeDatos(String baseDeDatos) {
	        this.baseDeDatos = baseDeDatos;
	    }

	    public void setRandom(double random) {
	        this.random = random;
	    }

	    public String getUrl() {
	        return url;
	    }

	    public String getBaseDeDatos() {
	        return baseDeDatos;
	    }

	    public double getRandom() {
	        return random;
	    }
}
