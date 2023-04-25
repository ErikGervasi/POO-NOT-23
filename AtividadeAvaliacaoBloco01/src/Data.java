import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
{

		Date dataInicial = null;
		Date dataInstalacao = null;
		String strDataInicial = "02/01/2018 00:01";
		String strDataInstalacao = null;



		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		try {
			dataInstalacao = sdf1.parse(strDataInstalacao);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dataInicial = sdf2.parse(strDataInicial);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(dataInicial.after(dataInstalacao)) {
		System.out.println("ok");}
		
	}}