package alumno.unlam.edu.ar.Ascensor;

import static org.junit.Assert.*;

import org.junit.Test;

public class AscensorTest {



		@Test
		public void queSePuedaCrearUnAscensorConNombrePisoMaximoPisoMinimoPisoActualEn0CantidadDePersonasYPesoMaximo() {
			//Preparacion
			Ascensor Topolin;
			final Integer PISO_MAXIMO_ESPERADO = 10;
			final Integer PISO_MINIMO_ESPERADO = -1;
			final Integer CANITDAD_DE_PERSONAS_ESPERADO = 5;
			final Double PESO_MAXIMO_ESPERADO = 100.50;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			
			//Validacion
			assertEquals(PISO_MAXIMO_ESPERADO, PISO_MAXIMO);
			assertEquals(PISO_MINIMO_ESPERADO, PISO_MINIMO);
			assertEquals(CANITDAD_DE_PERSONAS_ESPERADO, CANITDAD_DE_PERSONAS);
			assertEquals(PESO_MAXIMO_ESPERADO,PESO_MAXIMO);
		}
		
		@Test
		public void queSePuedaSubirUnaPersonaAlAcensor()  {
			//Preparacion
			Ascensor Topolin;
			Persona Santiago;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			
			final String NOMBRE_APELLIDO = "Santiago Livieri";
			final Integer DOC= 38695899;
			final Double PESO = 75.50;
		
			
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Santiago = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			
			//Validacion
			assertTrue(Topolin.subir( Santiago));
			
			
		}
		
		@Test
		public void queSePuedaBajarUnaPersonadelAcensor( )  {
			Ascensor Topolin;
			Persona Santiago;
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			
			final String NOMBRE_APELLIDO = "Santiago Livieri";
			final Integer DOC= 38695899;
			final Double PESO = 75.50;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Santiago = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Topolin.subir(Santiago);
			
			//Validacion
			Boolean LobajodelAscensor = Topolin.bajar(Santiago);
			assertTrue(LobajodelAscensor);
			
		}

		@Test
		public void queSePuedaObteneLaCantidadDePersonasQueHayAcensor()  {
			Ascensor Topolin;
			Persona Santiago;
			Persona Fiorella;
			Persona Lucas;
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 3;
			final Double PESO_MAXIMO = 100.50;
			
			final String NOMBRE_APELLIDO = "Santiago Livieri";
			final Integer DOC= 38695899;
			final Integer DOC_2= 38695898;
			final Integer DOC_3= 386958978;
			final Double PESO = 75.50;
			
			final Integer CANITDAD_DE_PERSONAS_ESPERADAS = 3;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Santiago = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Fiorella = new Persona(NOMBRE_APELLIDO, DOC_2, PESO);
			Lucas = new Persona(NOMBRE_APELLIDO, DOC_3, PESO);
			Topolin.subir(Santiago);
			Topolin.subir( Fiorella);
			Topolin.subir(Lucas);
			
			//Validacion
			assertEquals(CANITDAD_DE_PERSONAS_ESPERADAS, Topolin.getCantidadDePersonasEnElAscensor());
		}
		

		@Test
		public void queSePuedaCalcularLaSumatoriaDelPesoTodasLAsPersonasQueHayAcensor()  {
			Ascensor Topolin;
			Persona Santiago;
			Persona Fiorella;
			Persona Lucas;
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 210.0;
			
			final String NOMBRE_APELLIDO = "Santiago Livieri";
			final Integer DOC= 38695899;
			final Double PESO = 75.50;
			
			final String NOMBRE_APELLIDO_2 = "Fiorella Fiorella";
			final Integer DOC_2= 38695897;
			final Double PESO_2 = 50.0;
			
			final String NOMBRE_APELLIDO_3 = "Lucas Lucas";
			final Integer DOC_3= 38695893;
			final Double PESO_3 = 90.50;
			
			final Double PESO_DE_CARGA_ESPERADO = PESO_3 + PESO_2 + PESO;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Santiago = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Fiorella = new Persona(NOMBRE_APELLIDO_2, DOC_2, PESO_2);
			Lucas = new Persona(NOMBRE_APELLIDO_3, DOC_3, PESO_3);
			
			Topolin.subir( Santiago);
			Topolin.subir( Fiorella);
			Topolin.subir( Lucas);
			
			Double pesoCalculado = Topolin.calcularPesoTotal();
			System.out.println("peso calculado"+" "+pesoCalculado);
			System.out.println("peso esperado"+" "+PESO_DE_CARGA_ESPERADO);
			
			//Validacion
			assertEquals(PESO_DE_CARGA_ESPERADO, pesoCalculado);
		}

		@Test
		public void queCuandoUnAscensorSeCreaPuedaIraUnPiso() {
			Ascensor Topolin;
	
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			final Integer PISO_DESEADO = 2;
		
				
			final Integer PISO_ESPERADO = 2;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Topolin.abrirOCerrraPuerta();
			
			//Validacion
			assertEquals(PISO_ESPERADO ,Topolin.irAlPiso(PISO_DESEADO));
		}
		
		
		@Test
		public void queCuandoSeQuieraIrAUnPisoMayorAlPisoMaximoElAscensorPermanezcaEnELPisoActual(){
			Ascensor Topolin;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			
			final Integer PISO_DESEADO = 11;
			final Integer PISO_DESEADO_2 = 10;
				
			final Integer PISO_ESPERADO = 11;
			final Integer PISO_ESPERADO_2 = 10;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Topolin.irAlPiso(PISO_DESEADO_2);
			Topolin.irAlPiso(PISO_DESEADO);
			Topolin.abrirOCerrraPuerta();
			
			//Validacion
			assertNotEquals(PISO_ESPERADO ,Topolin.irAlPiso(PISO_DESEADO));
			assertEquals(PISO_ESPERADO_2 ,Topolin.irAlPiso(PISO_DESEADO_2));
			assertEquals(PISO_ESPERADO_2 ,Topolin.getPisoActual());
			assertEquals(PISO_MAXIMO ,Topolin.getPisoActual());
		
		}
		

		@Test
		public void queCuandoSeQuieraIrAUnPisoMenorAlPisoMinimoElAscensorPermanezcaEnELPisoActual(){
			Ascensor Topolin;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			final Integer PISO_DESEADO = -3;
			final Integer PISO_DESEADO_2 = -1;
				
			final Integer PISO_ESPERADO = -3;
			final Integer PISO_ESPERADO_2 = -1;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Topolin.irAlPiso(PISO_DESEADO_2);
			Topolin.irAlPiso(PISO_DESEADO);
			Topolin.abrirOCerrraPuerta();
			
			//Validacion
			assertNotEquals(PISO_ESPERADO ,Topolin.irAlPiso(PISO_DESEADO));
			assertEquals(PISO_ESPERADO_2 ,Topolin.irAlPiso(PISO_DESEADO_2));
			assertEquals(PISO_ESPERADO_2 ,Topolin.getPisoActual());
			assertEquals(PISO_MINIMO ,Topolin.getPisoActual());
		}
		
		@Test
		public void queSePuedaCerrarUnaPuerta( )  {
			Ascensor Topolin;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			
			final Boolean PUERTA_CERRADA_ESPERADA = false;
			final Boolean PUERTA_CERRADA;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			PUERTA_CERRADA = Topolin.abrirOCerrraPuerta();
			
			//Validacion
			assertEquals(PUERTA_CERRADA_ESPERADA, PUERTA_CERRADA);
			assertFalse(PUERTA_CERRADA);
		}
		
		
		@Test
		public void queSePuedaAbrirUnaPuerta( )  {
			Ascensor Topolin;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			
			final Boolean PUERTA_ABIERTA_ESPERADA = true;
			final Boolean PUERTA_ABIERTA;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Topolin.abrirOCerrraPuerta();
			PUERTA_ABIERTA = Topolin.abrirOCerrraPuerta();
			
			//Validacion
			assertEquals(PUERTA_ABIERTA_ESPERADA, PUERTA_ABIERTA);
			assertTrue(PUERTA_ABIERTA);
		}
		
		@Test
		public void queCuandoLaPuertaEsteAbiertaNoPuedaIrAlPisoDseadoYpermenezcaEnELPisoActual()  {
			//Preparacion
			Ascensor Topolin;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			
			final Integer PISO_DESEADO = 3;
			final Integer PISO_ESPERADO = 3;
			final Boolean PUERTA_ABIERTA;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Topolin.abrirOCerrraPuerta();
			PUERTA_ABIERTA = Topolin.abrirOCerrraPuerta();
			
			//Validacion
			assertTrue(PUERTA_ABIERTA);
			assertNotEquals(PISO_ESPERADO ,Topolin.irAlPiso(PISO_DESEADO));
		}
		
		@Test
		public void queCuandoLaPuertaEsteCerradaElAscensorVayaAlPisoDeseado( )  {
			Ascensor Topolin;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			
			final Integer PISO_DESEADO = 3;
			final Integer PISO_ESPERADO = 3;
			final Boolean PUERTA_CERRADA;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			PUERTA_CERRADA = Topolin.abrirOCerrraPuerta();
			
			//Validacion
			assertFalse(PUERTA_CERRADA);
			assertEquals(PISO_ESPERADO ,Topolin.irAlPiso(PISO_DESEADO));
		}
		
		@Test
		public void queNoSePuedaSubirUnaPersonaAlAscensorSiSuPeraLaCantidadDePersonasMaxinasPermitidas()  {
			//Preparacion
			Ascensor Topolin;
			
			Persona Santiago;
			Persona Fiorella;
			Persona Lucas;
			Persona Sebastian;
			Persona Christian;
			Persona Marco;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 100.50;
			
			final String NOMBRE_APELLIDO = "Santiago Livieri";
			final Integer DOC= 38695899;
			final Double PESO = 75.50;
			
			final Integer CANITDAD_DE_PERSONAS_ESPERADAS = 6;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			
			Santiago = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Fiorella = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Lucas = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Sebastian = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Christian = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Marco = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			
			
			Topolin.subir( Santiago);
			Topolin.subir(Fiorella);
			Topolin.subir(Lucas);
			Topolin.subir(Sebastian);
			Topolin.subir(Christian);
			Topolin.subir( Marco);
		
			//Validacion
			System.out.println(Topolin.getCantidadDePersonasEnElAscensor());
			assertNotEquals(CANITDAD_DE_PERSONAS_ESPERADAS, Topolin.getCantidadDePersonasEnElAscensor());
		}
		
		@Test
		public void queNoSePuedaSubirUnaPersonaAlAscensorSiSuPeraELPesoMaximoPermitidoDelAscensor( )  {
			Ascensor Topolin;
			
			Persona Santiago;
			Persona Fiorella;
			Persona Lucas;
			Persona Sebastian;
			Persona Christian;
			Persona Marco;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 300.0;
			
			final String NOMBRE_APELLIDO = "Santiago Livieri";
			final Integer DOC= 38695899;
			final Double PESO = 100.0;
			
			final String NOMBRE_APELLIDO_2 = "Fiorella Fiorella";
			final Integer DOC_2= 38695898;
			final Double PESO_2 = 50.0;
			
			final String NOMBRE_APELLIDO_3 = "Lucas Lucas";
			final Integer DOC_3= 38695897;
			final Double PESO_3 = 150.0;
			

			final String NOMBRE_APELLIDO_4 = "Sebastian Livieri";
			final Integer DOC_4= 38695896;
			final Double PESO_4 =  25.0;
			
			final String NOMBRE_APELLIDO_5 = "Christian";
			final Integer DOC_5= 38695895;
			final Double PESO_5 = 80.0;
			
			final String NOMBRE_APELLIDO_6 = "Marco ";
			final Integer DOC_6= 38695894;
			final Double PESO_6 = 90.0;
			
			final Double PESO_DE_CARGA_ESPERADO_1 = PESO + PESO_2 + PESO_3 + PESO_4;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			
			Santiago = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Fiorella = new Persona(NOMBRE_APELLIDO_2, DOC_2, PESO_2);
			Lucas = new Persona(NOMBRE_APELLIDO_3, DOC_3, PESO_3);
			Sebastian  = new Persona(NOMBRE_APELLIDO_4, DOC_4, PESO_4);
			Christian = new Persona(NOMBRE_APELLIDO_5, DOC_5, PESO_5);
			Marco = new Persona(NOMBRE_APELLIDO_6, DOC_6, PESO_6);
			
			Topolin.subir(Santiago);
			Topolin.subir(Fiorella);
			Topolin.subir(Lucas);	
			Topolin.subir(Sebastian);
			Topolin.subir(Christian);
			Topolin.subir(Marco);		
			
			Double PesoCalculado = Topolin.calcularPesoTotal();
			
			//Validacion
			assertEquals(PESO_DE_CARGA_ESPERADO_1, PesoCalculado, 30);
			
		}
		
		@Test
		public void queNoSePuedaSubirUnaPersonaAlAscensorSiLaPuertaEstaCerrada () {
			//Preparacion
			Ascensor Topolin;
			Persona Santiago;
			Persona Fiorella;
			Persona Lucas;
			Persona Sebastian;
			Persona Marco;
			
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 350.0;
			
			final Integer PERSONAS_QUE_SUBEN = 3;
			final Boolean PUERTA_CERRADA;
			Integer PersonasEnElAscensor;
			
			final String NOMBRE_APELLIDO = "Santiago Livieri";
			final Integer DOC= 38695899;
			final Double PESO = 100.0;
			
			final String NOMBRE_APELLIDO_2 = "Fiorella Fiorella";
			final Integer DOC_2= 38695898;
			final Double PESO_2 = 50.0;
			
			final String NOMBRE_APELLIDO_3 = "Lucas Lucas";
			final Integer DOC_3= 38695897;
			final Double PESO_3 = 50.0;
			

			final String NOMBRE_APELLIDO_4 = "Sebastian Livieri";
			final Integer DOC_4= 38695896;
			final Double PESO_4 =  25.0;
			
			final String NOMBRE_APELLIDO_6 = "Marco ";
			final Integer DOC_6= 38695894;
			final Double PESO_6 = 125.0;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Santiago = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Fiorella = new Persona(NOMBRE_APELLIDO_2, DOC_2, PESO_2);
			Lucas = new Persona(NOMBRE_APELLIDO_3, DOC_3, PESO_3);
			Sebastian  = new Persona(NOMBRE_APELLIDO_4, DOC_4, PESO_4);
			Marco = new Persona(NOMBRE_APELLIDO_6, DOC_6, PESO_6);
			
			Topolin.subir(Santiago);
			Topolin.subir(Fiorella);
			Topolin.subir(Lucas);
		
			PUERTA_CERRADA = Topolin.abrirOCerrraPuerta();
			
			Topolin.subir(Sebastian);
			Topolin.subir(Marco);
			
			PersonasEnElAscensor = Topolin.getCantidadDePersonasEnElAscensor();
			
			//Validacion
			assertFalse(PUERTA_CERRADA);
			assertEquals(PERSONAS_QUE_SUBEN ,PersonasEnElAscensor);
		}
		
		
		@Test
		public void queNoSePuedaBajarUnaPersonaAlAscensorSiLaPuertaEstaCerrada () {
			//Preparacion
			Ascensor Topolin;
			Persona Santiago;
			Persona Fiorella;
			Persona Lucas;
			
			final Integer PISO_MAXIMO = 10;
			final Integer PISO_MINIMO = -1;
			final Integer CANITDAD_DE_PERSONAS = 5;
			final Double PESO_MAXIMO = 350.0;
			
			final Integer PERSONAS_ENASCENSOR = 3;
			final Boolean PUERTA_CERRADA;
			Integer PersonasEnElAscensor;
			
			final String NOMBRE_APELLIDO = "Santiago Livieri";
			final Integer DOC= 38695899;
			final Double PESO = 100.0;
			
			final String NOMBRE_APELLIDO_2 = "Fiorella Fiorella";
			final Integer DOC_2= 38695898;
			final Double PESO_2 = 50.0;
			
			final String NOMBRE_APELLIDO_3 = "Lucas Lucas";
			final Integer DOC_3= 38695897;
			final Double PESO_3 = 50.0;
			
			//Ejecucion
			Topolin = new Ascensor(PISO_MAXIMO, PISO_MINIMO, CANITDAD_DE_PERSONAS, PESO_MAXIMO);
			Santiago = new Persona(NOMBRE_APELLIDO, DOC, PESO);
			Fiorella = new Persona(NOMBRE_APELLIDO_2, DOC_2, PESO_2);
			Lucas = new Persona(NOMBRE_APELLIDO_3, DOC_3, PESO_3);
			
			Topolin.subir(Santiago);
			Topolin.subir(Fiorella);
			Topolin.subir(Lucas);
		
			PUERTA_CERRADA = Topolin.abrirOCerrraPuerta();
			
			Topolin.bajar(Santiago);
			Topolin.bajar(Lucas);
			
			PersonasEnElAscensor = Topolin.getCantidadDePersonasEnElAscensor();
			
			//Validacion
			assertFalse(PUERTA_CERRADA);
			assertEquals(PERSONAS_ENASCENSOR ,PersonasEnElAscensor);
		}
		
}
