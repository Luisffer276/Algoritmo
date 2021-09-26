/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concensionaria_vehiculos;
import java.util.Scanner;
/**
 *
 * @author LuisVillagran276
 */
public class CONCENSIONARIA_VEHICULOS {
    static Scanner vehiculo=new Scanner(System.in);
    //GAMA DE VEHICULOS
    static float SedanEconomico=18940F;
    static float Sedan=23570.00F;
    static float Deportivo=24100.00F;
    static float Hibrido=25100.00F;
    static float Coupe=19350.00F;
    static float CoupeDeportivo=24100.00F;
    static float Compacto=16190.00F;
    static float Hatchback=20150.00F;
    static float RallyEconomicov=34700.00F;
    //TRANSMICION
    static float Manual=0.00F;
    static float CVT=800.00F;
    static float ManualTurbo=0.00F;
    static float CVTTurbo=800.00F;
    //COLOR EXTERIOR
    static float CosmicBlue= 0.00F;
    static float BurgundyNight= 0.00F;
    static float RallyeRed= 0.00F;
    static float ModernSteel= 0.00F;
    static float TaffetaWhite= 0.00F;
    static float EnergyGreen= 0.00F;
    static float KonaCoffee= 0.00F;
    static float OrangeFury= 0.00F;
    static float HeliosYellow= 0.00F;
    static float SonicGray= 0.00F;
    static float PolishedMetal= 0.00F;
    //AROS
    static float QuinPulgadas= 0.00F;
    static float DieciPulgadas= 0.00F;
    static float DiecisiPulgadas= 1688.00F;
    static float DieciochPulgadas= 1700.00F;
    static float DiecinuePulgadas= 3011.00F;
    //ACCESORIOS EXTERIORES
    static float BodySideMolding= 217.00F;
    static float CarCover= 230.00F;
    static float DecklidSpoiler= 299.99F;
    static float DoorEdgeFilm= 42.00F;
    static float DoorEdgeGuards= 84.00F;
    static float DoorTrimChrome= 285.00F;
    static float DoorVisor= 184.00F;
    static float FrontFenderEmblems= 50.00F;
    static float RearBumperApplique= 70.00F;
    static float FogLights= 325.00F;
    static float NoseMascs= 158.00F;
    static float MoonrofVisor= 138.00F;
    static float SplashGuardSet= 104.00F;
    static float DustCover= 350.00F;
    static float DoorMirrorCover= 520.00F;

    //ACCESORIOS INTERIORES
    static float AllSeasonsFloorMats= 142.00F;
    static float AutomaticDimmingMirror= 219.00F;
    static float CargoHook= 12.00F;
    static float CargoNet= 49.00F;
    static float ConsoleIllumination= 250.00F;
    static float CargoOrganizer= 87.00F;
    static float DoorPanelProtector= 149.00F;
    static float ArmrestCompartiment= 337.00F;
    static float DoorSillTrim= 290.00F;
    static float CargoCover= 166.00F;
    static float CargoLiner= 187.00F;
    //ACCESORIOS ELECTRONICOS
    static float WirelessPhoneCharger= 187.00F;
    static float USBCharger= 187.00F;
    static float PuddleLight= 187.00F;
    static float ParkingSensors= 187.00F;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion=0;
        opcion=menu();
        do{
            switch(opcion){       
            case 1:
                opcion=Gama();
                switch(opcion){
                    ////**********************************////
                    ////PRIMER AUTOMOVIL
                    ////**********************************////
                    case 1:
                        opcion=Menu();
                        do{
                        switch(opcion){
                         case 1:
                        
                        opcion=Amenidades();
                            switch(opcion){
                             //****PARA PODER TENER EL PRECIO DE CON AMENIDAD TRANSMISION****//
                            case 1:
                            opcion=Transmision();
                                switch(opcion){
                                    case 1:
                                    float PrecioTotalManual=SedanEconomico + Manual;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                          Transmisión Manual $$" + Manual);
                                    System.out.println("Total:..................................................$$" + PrecioTotalManual );
                                    System.out.println("1.- Regresar al menu principal");                                                     
                                    break;
                                    case 2:
                                    float PrecioTotalCVT=SedanEconomico + CVT;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                             Transmisión CVT $$" + CVT);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCVT );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalManualTurbo=SedanEconomico + ManualTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                     Sedán Económico $$" +SedanEconomico);
                                    System.out.println("Amenidades:                   Transmisión Manual Turbo $$" + ManualTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalManualTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalCVTTurbo=SedanEconomico + CVTTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                     Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                      Transmisión CVT Turbo $$" + CVTTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalCVTTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR EXTERIOR
                                    //*****************
                                    case 2:
                                    opcion=ColorExterior();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCosmicBlue=SedanEconomico + CosmicBlue;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 Cosmic Blue $$" + CosmicBlue );
                                    System.out.println("Total:..................................................$$"  + PrecioTotalCosmicBlue );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalBurgundyNight=SedanEconomico + BurgundyNight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                              Burgundy Night $$" + BurgundyNight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBurgundyNight );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalRallyeRed=SedanEconomico + RallyeRed;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                  Rallye Red $$" + RallyeRed);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRallyeRed );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalModernSteel=SedanEconomico + ModernSteel;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                Modern Steel $$" + ModernSteel);
                                    System.out.println("Total:..................................................$$" + PrecioTotalModernSteel );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalTaffetaWhite=SedanEconomico + TaffetaWhite;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                               Taffeta White $$" + TaffetaWhite);
                                    System.out.println("Total:..................................................$$" + PrecioTotalTaffetaWhite );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalEnergyGreen=SedanEconomico + EnergyGreen;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                Energy Green $$" + EnergyGreen);
                                    System.out.println("Total:..................................................$$" + PrecioTotalEnergyGreen );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalKonaCoffee=SedanEconomico + KonaCoffee;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 Kona Coffee $$" + KonaCoffee);
                                    System.out.println("Total:..................................................$$" + PrecioTotalKonaCoffee );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalOrangeFury=SedanEconomico + OrangeFury;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 Orange Fury $$" + OrangeFury);
                                    System.out.println("Total:..................................................$$"+ PrecioTotalOrangeFury );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalHeliosYellow=SedanEconomico + HeliosYellow;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                               Helios Yellow $$" + HeliosYellow );
                                    System.out.println("Total:..................................................$$" + PrecioTotalHeliosYellow );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalSonicGray=SedanEconomico + SonicGray;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                  Sonic Gray $$" + SonicGray);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSonicGray );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 11:
                                    float PrecioTotalPolishedMetal=SedanEconomico + PolishedMetal;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                              Polished Metal $$ + PolishedMetal");
                                    System.out.println("Total:..................................................$$" + PrecioTotalPolishedMetal );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                                }
                                    break;
                                    //*************
                                    //PARA PODE TENER EL PRECIO DE AMENIDAD MAS AROS
                                    //*************
                                    case 3:
                                    opcion=Aros();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalQuinPulgadas=SedanEconomico + QuinPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 15 Pulgadas $$" + QuinPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalQuinPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 2:
                                    float PrecioTotalDieciPulgadas=SedanEconomico + DieciPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 16 Pulgadas $$" + DieciPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 3:
                                    float PrecioTotalDiecisiPulgadas=SedanEconomico + DiecisiPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 17 Pulgadas $$"+ DiecisiPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecisiPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 4:
                                    float PrecioTotalDieciochPulgadas=SedanEconomico + DieciochPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 18 Pulgadas $$" + DieciochPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciochPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 5:
                                    float PrecioTotalDiecinuePulgadas=SedanEconomico + DiecinuePulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 19 Pulgadas $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecinuePulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*************
                                    // PARA PODER TENER EL PRECIO CON AMENIDAD DE ACCESORIOS EXTERIORES
                                    //*************
                                    case 4:
                                    opcion=ACExteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCarCover=SedanEconomico + CarCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                   Car Cover $$" + CarCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCarCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalDecklidSpoiler=SedanEconomico + DecklidSpoiler;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                             Decklid Spoiler $$" + DecklidSpoiler);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDecklidSpoiler );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalDoorEdgeFilm=SedanEconomico + DoorEdgeFilm;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                              Door Edge Film $$" + DoorEdgeFilm);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeFilm );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalDoorEdgeGuards=SedanEconomico + DoorEdgeGuards;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                            Door Edge Guards $$" + DoorEdgeGuards);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeGuards );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalDoorTrimChrome=SedanEconomico + DoorTrimChrome;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                            Door Trim Chrome $$" + DoorTrimChrome);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorTrimChrome );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalDoorVisor=SedanEconomico + DoorVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                  Door Visor $$" + DoorVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalFrontFenderEmblems=SedanEconomico + FrontFenderEmblems;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                        Front Fender Emblems $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFrontFenderEmblems );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalRearBumperApplique=SedanEconomico + RearBumperApplique;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                        Rear Bumper Applique $$" + RearBumperApplique);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRearBumperApplique );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalFogLights=SedanEconomico + FogLights;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                  Fog Lights $$" + FogLights);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFogLights );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalNoseMascs=SedanEconomico + NoseMascs;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                  Nose Mascs $$" + NoseMascs);
                                    System.out.println("Total:..................................................$$" + PrecioTotalNoseMascs );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;                                                 
                                    case 11:
                                    float PrecioTotalMoonrofVisor=SedanEconomico + MoonrofVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                               Moonrof Visor $$" + MoonrofVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalMoonrofVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 12:
                                    float PrecioTotalSplashGuardSet=SedanEconomico + SplashGuardSet;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                             Splash GuardSet $$" + SplashGuardSet);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSplashGuardSet );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 13:
                                    float PrecioTotalDustCover=SedanEconomico + DustCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                  Dust Cover $$" + DustCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDustCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 14:
                                    float PrecioTotalDoorMirrorCover=SedanEconomico + DoorMirrorCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                           Door Mirror Cover $$" + DoorMirrorCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorMirrorCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 15:
                                    float PrecioTotalBodySideMolding=SedanEconomico + BodySideMolding;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                           Body Side Molding $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBodySideMolding );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                     }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR INTERIOR
                                    //*****************
                                    case 5:
                                    opcion=ACInteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalAllSeasonsFloorMats=SedanEconomico + AllSeasonsFloorMats;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                      All Seasons Floor Mats $$" + AllSeasonsFloorMats);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAllSeasonsFloorMats );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 2:
                                    float PrecioTotalAutomaticDimmingMirror=SedanEconomico + AutomaticDimmingMirror;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                    Automatic Dimming Mirror $$" + AutomaticDimmingMirror);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAutomaticDimmingMirror );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalConsoleIllumination=SedanEconomico + ConsoleIllumination;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                        Console Illumination $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalConsoleIllumination );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalCargoOrganizer=SedanEconomico + CargoOrganizer;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                             Cargo Organizer $$" + CargoOrganizer);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoOrganizer );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 5:
                                    float PrecioTotalDoorPanelProtector=SedanEconomico + DoorPanelProtector;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                        Door Panel Protector $$" + DoorPanelProtector);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorPanelProtector );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 6:
                                    float PrecioTotalArmrestCompartiment=SedanEconomico + ArmrestCompartiment;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                        Armrest Compartiment $$" + ArmrestCompartiment);
                                    System.out.println("Total:..................................................$$" + PrecioTotalArmrestCompartiment );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 7:
                                    float PrecioTotalDoorSillTrim=SedanEconomico + DoorSillTrim;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                              Door Sill Trim $$" + DoorSillTrim);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorSillTrim );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 8:
                                    float PrecioTotalCargoCover=SedanEconomico + CargoCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 Cargo Cover $$" + CargoCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoCover );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 9:
                                    float PrecioTotalCargoLiner=SedanEconomico + CargoLiner;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 Cargo Liner $$" + CargoLiner);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoLiner );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                                }
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD ACCESORIOS ELECTRONICOS
                                    //*****************
                                    break;
                                    case 6:
                                    opcion=ACElectronicos();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalWirelessPhoneCharger=SedanEconomico + WirelessPhoneCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                      Wireless Phone Charger $$" + WirelessPhoneCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalWirelessPhoneCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                     case 2:
                                    float PrecioTotalUSBCharger=SedanEconomico + USBCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                 USB Charger $$" + USBCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalUSBCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalPuddleLight=SedanEconomico + PuddleLight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                                Puddle Light $$" + PuddleLight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalPuddleLight );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalParkingSensors=SedanEconomico + ParkingSensors;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Sedán Económico $$"+SedanEconomico);
                                    System.out.println("Amenidades:                             Parking Sensors $$" + ParkingSensors);
                                    System.out.println("Total:..................................................$$" + PrecioTotalParkingSensors );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                                }
                                    break;
                                                }
                                    break;
                                       }
                    break;
                }while (opcion!=10);

        break;
        
        
        
        
        
        ////**********************************////
        ////SEGUNDO AUTOMOVIL
        ////**********************************////
        
        
        case 2:
  
            do{
                 
                opcion=Menu();
                switch(opcion){
                     case 1:
                        
                        opcion=Amenidades();
                            switch(opcion){
                             //****PARA PODER TENER EL PRECIO DE CON AMENIDAD TRANSMISION****//
                            case 1:
                            opcion=Transmision();
                                switch(opcion){
                                    case 1:
                                    float PrecioTotalManual=Sedan + Manual;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("PRUEBAAAAAAAAAAAAA\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                          Transmisión Manual $$" + Manual);
                                    System.out.println("Total:..................................................$$" + PrecioTotalManual );
                                    System.out.println("1.- Regresar al menu principal");                                                     
                                    break;
                                    case 2:
                                    float PrecioTotalCVT=Sedan + CVT;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                             Transmisión CVT $$" + CVT);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCVT );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalManualTurbo=Sedan + ManualTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                   Transmisión Manual Turbo $$" + ManualTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalManualTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalCVTTurbo=Sedan + CVTTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                      Transmisión CVT Turbo $$" + CVTTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalCVTTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR EXTERIOR
                                    //*****************
                                    case 2:
                                    opcion=ColorExterior();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCosmicBlue=Sedan + CosmicBlue;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 Cosmic Blue $$" + CosmicBlue );
                                    System.out.println("Total:..................................................$$"  + PrecioTotalCosmicBlue );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalBurgundyNight=Sedan + BurgundyNight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                              Burgundy Night $$" + BurgundyNight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBurgundyNight );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalRallyeRed=Sedan + RallyeRed;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                  Rallye Red $$" + RallyeRed);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRallyeRed );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalModernSteel=Sedan + ModernSteel;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                Modern Steel $$" + ModernSteel);
                                    System.out.println("Total:..................................................$$" + PrecioTotalModernSteel );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalTaffetaWhite=Sedan + TaffetaWhite;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                               Taffeta White $$" + TaffetaWhite);
                                    System.out.println("Total:..................................................$$" + PrecioTotalTaffetaWhite );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalEnergyGreen=Sedan + EnergyGreen;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                Energy Green $$" + EnergyGreen);
                                    System.out.println("Total:..................................................$$" + PrecioTotalEnergyGreen );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalKonaCoffee=Sedan + KonaCoffee;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 Kona Coffee $$" + KonaCoffee);
                                    System.out.println("Total:..................................................$$" + PrecioTotalKonaCoffee );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalOrangeFury=Sedan + OrangeFury;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 Orange Fury $$" + OrangeFury);
                                    System.out.println("Total:..................................................$$"+ PrecioTotalOrangeFury );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalHeliosYellow=Sedan + HeliosYellow;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                               Helios Yellow $$" + HeliosYellow );
                                    System.out.println("Total:..................................................$$" + PrecioTotalHeliosYellow );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalSonicGray=Sedan + SonicGray;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                  Sonic Gray $$" + SonicGray);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSonicGray );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 11:
                                    float PrecioTotalPolishedMetal=Sedan + PolishedMetal;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                              Polished Metal $$ + PolishedMetal");
                                    System.out.println("Total:..................................................$$" + PrecioTotalPolishedMetal );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                                }
                                    break;
                                    //*************
                                    //PARA PODE TENER EL PRECIO DE AMENIDAD MAS AROS
                                    //*************
                                    case 3:
                                    opcion=Aros();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalQuinPulgadas=Sedan + QuinPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 15 Pulgadas $$" + QuinPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalQuinPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 2:
                                    float PrecioTotalDieciPulgadas=Sedan + DieciPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 16 Pulgadas $$" + DieciPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 3:
                                    float PrecioTotalDiecisiPulgadas=Sedan + DiecisiPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 17 Pulgadas $$"+ DiecisiPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecisiPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 4:
                                    float PrecioTotalDieciochPulgadas=Sedan + DieciochPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 18 Pulgadas $$" + DieciochPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciochPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 5:
                                    float PrecioTotalDiecinuePulgadas=Sedan + DiecinuePulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 19 Pulgadas $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecinuePulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*************
                                    // PARA PODER TENER EL PRECIO CON AMENIDAD DE ACCESORIOS EXTERIORES
                                    //*************
                                    case 4:
                                    opcion=ACExteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCarCover=Sedan + CarCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                   Car Cover $$" + CarCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCarCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalDecklidSpoiler=Sedan + DecklidSpoiler;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                             Decklid Spoiler $$" + DecklidSpoiler);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDecklidSpoiler );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalDoorEdgeFilm=Sedan + DoorEdgeFilm;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                              Door Edge Film $$" + DoorEdgeFilm);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeFilm );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalDoorEdgeGuards=Sedan + DoorEdgeGuards;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                            Door Edge Guards $$" + DoorEdgeGuards);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeGuards );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalDoorTrimChrome=Sedan + DoorTrimChrome;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                            Door Trim Chrome $$" + DoorTrimChrome);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorTrimChrome );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalDoorVisor=Sedan + DoorVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                  Door Visor $$" + DoorVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalFrontFenderEmblems=Sedan + FrontFenderEmblems;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                        Front Fender Emblems $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFrontFenderEmblems );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalRearBumperApplique=Sedan + RearBumperApplique;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                        Rear Bumper Applique $$" + RearBumperApplique);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRearBumperApplique );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalFogLights=Sedan + FogLights;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                  Fog Lights $$" + FogLights);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFogLights );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalNoseMascs=Sedan + NoseMascs;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                  Nose Mascs $$" + NoseMascs);
                                    System.out.println("Total:..................................................$$" + PrecioTotalNoseMascs );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;                                                 
                                    case 11:
                                    float PrecioTotalMoonrofVisor=Sedan + MoonrofVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                               Moonrof Visor $$" + MoonrofVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalMoonrofVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 12:
                                    float PrecioTotalSplashGuardSet=Sedan + SplashGuardSet;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                             Splash GuardSet $$" + SplashGuardSet);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSplashGuardSet );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 13:
                                    float PrecioTotalDustCover=Sedan + DustCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                  Dust Cover $$" + DustCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDustCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 14:
                                    float PrecioTotalDoorMirrorCover=Sedan + DoorMirrorCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                           Door Mirror Cover $$" + DoorMirrorCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorMirrorCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 15:
                                    float PrecioTotalBodySideMolding=Sedan + BodySideMolding;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                           Body Side Molding $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBodySideMolding );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                     }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR INTERIOR
                                    //*****************
                                    case 5:
                                    opcion=ACInteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalAllSeasonsFloorMats=Sedan + AllSeasonsFloorMats;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                      All Seasons Floor Mats $$" + AllSeasonsFloorMats);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAllSeasonsFloorMats );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 2:
                                    float PrecioTotalAutomaticDimmingMirror=Sedan + AutomaticDimmingMirror;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                    Automatic Dimming Mirror $$" + AutomaticDimmingMirror);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAutomaticDimmingMirror );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalConsoleIllumination=Sedan + ConsoleIllumination;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                        Console Illumination $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalConsoleIllumination );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalCargoOrganizer=Sedan + CargoOrganizer;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                             Cargo Organizer $$" + CargoOrganizer);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoOrganizer );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 5:
                                    float PrecioTotalDoorPanelProtector=Sedan + DoorPanelProtector;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                        Door Panel Protector $$" + DoorPanelProtector);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorPanelProtector );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 6:
                                    float PrecioTotalArmrestCompartiment=Sedan + ArmrestCompartiment;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                        Armrest Compartiment $$" + ArmrestCompartiment);
                                    System.out.println("Total:..................................................$$" + PrecioTotalArmrestCompartiment );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 7:
                                    float PrecioTotalDoorSillTrim=Sedan + DoorSillTrim;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                              Door Sill Trim $$" + DoorSillTrim);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorSillTrim );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 8:
                                    float PrecioTotalCargoCover=Sedan + CargoCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 Cargo Cover $$" + CargoCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoCover );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 9:
                                    float PrecioTotalCargoLiner=Sedan + CargoLiner;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 Cargo Liner $$" + CargoLiner);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoLiner );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                                }
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD ACCESORIOS ELECTRONICOS
                                    //*****************
                                    break;
                                    case 6:
                                    opcion=ACElectronicos();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalWirelessPhoneCharger=Sedan + WirelessPhoneCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                      Wireless Phone Charger $$" + WirelessPhoneCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalWirelessPhoneCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                     case 2:
                                    float PrecioTotalUSBCharger=Sedan + USBCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                 USB Charger $$" + USBCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalUSBCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalPuddleLight=Sedan + PuddleLight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                                Puddle Light $$" + PuddleLight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalPuddleLight );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalParkingSensors=Sedan + ParkingSensors;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Sedán $$"+Sedan);
                                    System.out.println("Amenidades:                             Parking Sensors $$" + ParkingSensors);
                                    System.out.println("Total:..................................................$$" + PrecioTotalParkingSensors );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                                }
                                    break;
                                                }
                                    break;
                                       }

                                    break;                                     
                               
          
                        }while (opcion!=10);
            
            break;
            
        ////**********************************////
        ////TERCER AUTOMOVIL
        ////**********************************////    
            
        case 3:
            
            do{
                 
                opcion=Menu();
                switch(opcion){
                     case 1:
                        
                        opcion=Amenidades();
                            switch(opcion){
                             //****PARA PODER TENER EL PRECIO DE CON AMENIDAD TRANSMISION****//
                            case 1:
                            opcion=Transmision();
                                switch(opcion){
                                    case 1:
                                    float PrecioTotalManual=Deportivo + Manual;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                          Transmisión Manual $$" + Manual);
                                    System.out.println("Total:..................................................$$" + PrecioTotalManual );
                                    System.out.println("1.- Regresar al menu principal");                                                     
                                    break;
                                    case 2:
                                    float PrecioTotalCVT=Deportivo + CVT;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                             Transmisión CVT $$" + CVT);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCVT );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalManualTurbo=Deportivo + ManualTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                   Transmisión Manual Turbo $$" + ManualTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalManualTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalCVTTurbo=Deportivo + CVTTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                      Transmisión CVT Turbo $$" + CVTTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalCVTTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR EXTERIOR
                                    //*****************
                                    case 2:
                                    opcion=ColorExterior();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCosmicBlue=Deportivo + CosmicBlue;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 Cosmic Blue $$" + CosmicBlue );
                                    System.out.println("Total:..................................................$$"  + PrecioTotalCosmicBlue );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalBurgundyNight=Deportivo + BurgundyNight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                              Burgundy Night $$" + BurgundyNight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBurgundyNight );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalRallyeRed=Deportivo + RallyeRed;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                  Rallye Red $$" + RallyeRed);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRallyeRed );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalModernSteel=Deportivo + ModernSteel;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                Modern Steel $$" + ModernSteel);
                                    System.out.println("Total:..................................................$$" + PrecioTotalModernSteel );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalTaffetaWhite=Deportivo + TaffetaWhite;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                               Taffeta White $$" + TaffetaWhite);
                                    System.out.println("Total:..................................................$$" + PrecioTotalTaffetaWhite );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalEnergyGreen=Deportivo + EnergyGreen;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                Energy Green $$" + EnergyGreen);
                                    System.out.println("Total:..................................................$$" + PrecioTotalEnergyGreen );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalKonaCoffee=Deportivo + KonaCoffee;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 Kona Coffee $$" + KonaCoffee);
                                    System.out.println("Total:..................................................$$" + PrecioTotalKonaCoffee );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalOrangeFury=Deportivo + OrangeFury;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 Orange Fury $$" + OrangeFury);
                                    System.out.println("Total:..................................................$$"+ PrecioTotalOrangeFury );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalHeliosYellow=Deportivo + HeliosYellow;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                               Helios Yellow $$" + HeliosYellow );
                                    System.out.println("Total:..................................................$$" + PrecioTotalHeliosYellow );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalSonicGray=Deportivo + SonicGray;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                  Sonic Gray $$" + SonicGray);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSonicGray );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 11:
                                    float PrecioTotalPolishedMetal=Deportivo + PolishedMetal;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                              Polished Metal $$ + PolishedMetal");
                                    System.out.println("Total:..................................................$$" + PrecioTotalPolishedMetal );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                                }
                                    break;
                                    //*************
                                    //PARA PODE TENER EL PRECIO DE AMENIDAD MAS AROS
                                    //*************
                                    case 3:
                                    opcion=Aros();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalQuinPulgadas=Deportivo + QuinPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 15 Pulgadas $$" + QuinPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalQuinPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 2:
                                    float PrecioTotalDieciPulgadas=Deportivo + DieciPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 16 Pulgadas $$" + DieciPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 3:
                                    float PrecioTotalDiecisiPulgadas=Deportivo + DiecisiPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 17 Pulgadas $$"+ DiecisiPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecisiPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 4:
                                    float PrecioTotalDieciochPulgadas=Deportivo + DieciochPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 18 Pulgadas $$" + DieciochPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciochPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 5:
                                    float PrecioTotalDiecinuePulgadas=Deportivo + DiecinuePulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 19 Pulgadas $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecinuePulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*************
                                    // PARA PODER TENER EL PRECIO CON AMENIDAD DE ACCESORIOS EXTERIORES
                                    //*************
                                    case 4:
                                    opcion=ACExteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCarCover=Deportivo + CarCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                   Car Cover $$" + CarCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCarCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalDecklidSpoiler=Deportivo + DecklidSpoiler;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                             Decklid Spoiler $$" + DecklidSpoiler);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDecklidSpoiler );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalDoorEdgeFilm=Deportivo + DoorEdgeFilm;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                              Door Edge Film $$" + DoorEdgeFilm);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeFilm );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalDoorEdgeGuards=Deportivo + DoorEdgeGuards;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                            Door Edge Guards $$" + DoorEdgeGuards);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeGuards );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalDoorTrimChrome=Deportivo + DoorTrimChrome;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                            Door Trim Chrome $$" + DoorTrimChrome);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorTrimChrome );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalDoorVisor=Deportivo + DoorVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                  Door Visor $$" + DoorVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalFrontFenderEmblems=Deportivo + FrontFenderEmblems;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                        Front Fender Emblems $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFrontFenderEmblems );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalRearBumperApplique=Deportivo + RearBumperApplique;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                        Rear Bumper Applique $$" + RearBumperApplique);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRearBumperApplique );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalFogLights=Deportivo + FogLights;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                  Fog Lights $$" + FogLights);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFogLights );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalNoseMascs=Deportivo + NoseMascs;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                  Nose Mascs $$" + NoseMascs);
                                    System.out.println("Total:..................................................$$" + PrecioTotalNoseMascs );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;                                                 
                                    case 11:
                                    float PrecioTotalMoonrofVisor=Deportivo + MoonrofVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                               Moonrof Visor $$" + MoonrofVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalMoonrofVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 12:
                                    float PrecioTotalSplashGuardSet=Deportivo + SplashGuardSet;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                             Splash GuardSet $$" + SplashGuardSet);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSplashGuardSet );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 13:
                                    float PrecioTotalDustCover=Deportivo + DustCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                  Dust Cover $$" + DustCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDustCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 14:
                                    float PrecioTotalDoorMirrorCover=Deportivo + DoorMirrorCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                           Door Mirror Cover $$" + DoorMirrorCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorMirrorCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 15:
                                    float PrecioTotalBodySideMolding=Deportivo + BodySideMolding;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                           Body Side Molding $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBodySideMolding );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                     }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR INTERIOR
                                    //*****************
                                    case 5:
                                    opcion=ACInteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalAllSeasonsFloorMats=Deportivo + AllSeasonsFloorMats;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                      All Seasons Floor Mats $$" + AllSeasonsFloorMats);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAllSeasonsFloorMats );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 2:
                                    float PrecioTotalAutomaticDimmingMirror=Deportivo + AutomaticDimmingMirror;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                    Automatic Dimming Mirror $$" + AutomaticDimmingMirror);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAutomaticDimmingMirror );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalConsoleIllumination=Deportivo + ConsoleIllumination;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                        Console Illumination $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalConsoleIllumination );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalCargoOrganizer=Deportivo + CargoOrganizer;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                             Cargo Organizer $$" + CargoOrganizer);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoOrganizer );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 5:
                                    float PrecioTotalDoorPanelProtector=Deportivo + DoorPanelProtector;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                        Door Panel Protector $$" + DoorPanelProtector);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorPanelProtector );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 6:
                                    float PrecioTotalArmrestCompartiment=Deportivo + ArmrestCompartiment;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                        Armrest Compartiment $$" + ArmrestCompartiment);
                                    System.out.println("Total:..................................................$$" + PrecioTotalArmrestCompartiment );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 7:
                                    float PrecioTotalDoorSillTrim=Deportivo + DoorSillTrim;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                              Door Sill Trim $$" + DoorSillTrim);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorSillTrim );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 8:
                                    float PrecioTotalCargoCover=Deportivo + CargoCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 Cargo Cover $$" + CargoCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoCover );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 9:
                                    float PrecioTotalCargoLiner=Deportivo + CargoLiner;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 Cargo Liner $$" + CargoLiner);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoLiner );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                                }
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD ACCESORIOS ELECTRONICOS
                                    //*****************
                                    break;
                                    case 6:
                                    opcion=ACElectronicos();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalWirelessPhoneCharger=Deportivo + WirelessPhoneCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                      Wireless Phone Charger $$" + WirelessPhoneCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalWirelessPhoneCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                     case 2:
                                    float PrecioTotalUSBCharger=Deportivo + USBCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                 USB Charger $$" + USBCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalUSBCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalPuddleLight=Deportivo + PuddleLight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                                Puddle Light $$" + PuddleLight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalPuddleLight );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalParkingSensors=Deportivo + ParkingSensors;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Deportivo $$"+Deportivo);
                                    System.out.println("Amenidades:                             Parking Sensors $$" + ParkingSensors);
                                    System.out.println("Total:..................................................$$" + PrecioTotalParkingSensors );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                                }
                                    break;
                                                }
                                    break;
                                       }

                                    break;                                     
                               
          
                        }while (opcion!=10);
            
            
            break;
            
            
        ////**********************************////
        //// CUARTO AUTOMOVIL
        ////**********************************////            
            
            
        case 4:
            
            do{
                 
                opcion=Menu();
                switch(opcion){
                     case 1:
                        
                        opcion=Amenidades();
                            switch(opcion){
                             //****PARA PODER TENER EL PRECIO DE CON AMENIDAD TRANSMISION****//
                            case 1:
                            opcion=Transmision();
                                switch(opcion){
                                    case 1:
                                    float PrecioTotalManual=Hibrido + Manual;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                          Transmisión Manual $$" + Manual);
                                    System.out.println("Total:..................................................$$" + PrecioTotalManual );
                                    System.out.println("1.- Regresar al menu principal");                                                     
                                    break;
                                    case 2:
                                    float PrecioTotalCVT=Hibrido + CVT;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                             Transmisión CVT $$" + CVT);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCVT );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalManualTurbo=Hibrido + ManualTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                   Transmisión Manual Turbo $$" + ManualTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalManualTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalCVTTurbo=Hibrido + CVTTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                      Transmisión CVT Turbo $$" + CVTTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalCVTTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR EXTERIOR
                                    //*****************
                                    case 2:
                                    opcion=ColorExterior();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCosmicBlue=Hibrido + CosmicBlue;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 Cosmic Blue $$" + CosmicBlue );
                                    System.out.println("Total:..................................................$$"  + PrecioTotalCosmicBlue );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalBurgundyNight=Hibrido + BurgundyNight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                              Burgundy Night $$" + BurgundyNight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBurgundyNight );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalRallyeRed=Hibrido + RallyeRed;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                  Rallye Red $$" + RallyeRed);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRallyeRed );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalModernSteel=Hibrido + ModernSteel;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                Modern Steel $$" + ModernSteel);
                                    System.out.println("Total:..................................................$$" + PrecioTotalModernSteel );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalTaffetaWhite=Hibrido + TaffetaWhite;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                               Taffeta White $$" + TaffetaWhite);
                                    System.out.println("Total:..................................................$$" + PrecioTotalTaffetaWhite );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalEnergyGreen=Hibrido + EnergyGreen;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                Energy Green $$" + EnergyGreen);
                                    System.out.println("Total:..................................................$$" + PrecioTotalEnergyGreen );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalKonaCoffee=Hibrido + KonaCoffee;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 Kona Coffee $$" + KonaCoffee);
                                    System.out.println("Total:..................................................$$" + PrecioTotalKonaCoffee );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalOrangeFury=Hibrido + OrangeFury;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 Orange Fury $$" + OrangeFury);
                                    System.out.println("Total:..................................................$$"+ PrecioTotalOrangeFury );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalHeliosYellow=Hibrido + HeliosYellow;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                               Helios Yellow $$" + HeliosYellow );
                                    System.out.println("Total:..................................................$$" + PrecioTotalHeliosYellow );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalSonicGray=Hibrido + SonicGray;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                  Sonic Gray $$" + SonicGray);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSonicGray );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 11:
                                    float PrecioTotalPolishedMetal=Hibrido + PolishedMetal;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                              Polished Metal $$ + PolishedMetal");
                                    System.out.println("Total:..................................................$$" + PrecioTotalPolishedMetal );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                                }
                                    break;
                                    //*************
                                    //PARA PODE TENER EL PRECIO DE AMENIDAD MAS AROS
                                    //*************
                                    case 3:
                                    opcion=Aros();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalQuinPulgadas=Hibrido + QuinPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 15 Pulgadas $$" + QuinPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalQuinPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 2:
                                    float PrecioTotalDieciPulgadas=Hibrido + DieciPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 16 Pulgadas $$" + DieciPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 3:
                                    float PrecioTotalDiecisiPulgadas=Hibrido + DiecisiPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 17 Pulgadas $$"+ DiecisiPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecisiPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 4:
                                    float PrecioTotalDieciochPulgadas=Hibrido + DieciochPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 18 Pulgadas $$" + DieciochPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciochPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 5:
                                    float PrecioTotalDiecinuePulgadas=Hibrido + DiecinuePulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 19 Pulgadas $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecinuePulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*************
                                    // PARA PODER TENER EL PRECIO CON AMENIDAD DE ACCESORIOS EXTERIORES
                                    //*************
                                    case 4:
                                    opcion=ACExteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCarCover=Hibrido + CarCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                   Car Cover $$" + CarCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCarCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalDecklidSpoiler=Hibrido + DecklidSpoiler;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                             Decklid Spoiler $$" + DecklidSpoiler);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDecklidSpoiler );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalDoorEdgeFilm=Hibrido + DoorEdgeFilm;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                              Door Edge Film $$" + DoorEdgeFilm);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeFilm );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalDoorEdgeGuards=Hibrido + DoorEdgeGuards;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                            Door Edge Guards $$" + DoorEdgeGuards);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeGuards );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalDoorTrimChrome=Hibrido + DoorTrimChrome;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                            Door Trim Chrome $$" + DoorTrimChrome);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorTrimChrome );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalDoorVisor=Hibrido + DoorVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                  Door Visor $$" + DoorVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalFrontFenderEmblems=Hibrido + FrontFenderEmblems;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                        Front Fender Emblems $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFrontFenderEmblems );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalRearBumperApplique=Hibrido + RearBumperApplique;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                        Rear Bumper Applique $$" + RearBumperApplique);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRearBumperApplique );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalFogLights=Hibrido + FogLights;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                  Fog Lights $$" + FogLights);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFogLights );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalNoseMascs=Hibrido + NoseMascs;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                  Nose Mascs $$" + NoseMascs);
                                    System.out.println("Total:..................................................$$" + PrecioTotalNoseMascs );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;                                                 
                                    case 11:
                                    float PrecioTotalMoonrofVisor=Hibrido + MoonrofVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                               Moonrof Visor $$" + MoonrofVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalMoonrofVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 12:
                                    float PrecioTotalSplashGuardSet=Hibrido + SplashGuardSet;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                             Splash GuardSet $$" + SplashGuardSet);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSplashGuardSet );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 13:
                                    float PrecioTotalDustCover=Hibrido + DustCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                  Dust Cover $$" + DustCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDustCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 14:
                                    float PrecioTotalDoorMirrorCover=Hibrido + DoorMirrorCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                           Door Mirror Cover $$" + DoorMirrorCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorMirrorCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 15:
                                    float PrecioTotalBodySideMolding=Hibrido + BodySideMolding;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                           Body Side Molding $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBodySideMolding );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                     }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR INTERIOR
                                    //*****************
                                    case 5:
                                    opcion=ACInteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalAllSeasonsFloorMats=Hibrido + AllSeasonsFloorMats;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                      All Seasons Floor Mats $$" + AllSeasonsFloorMats);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAllSeasonsFloorMats );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 2:
                                    float PrecioTotalAutomaticDimmingMirror=Hibrido + AutomaticDimmingMirror;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                    Automatic Dimming Mirror $$" + AutomaticDimmingMirror);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAutomaticDimmingMirror );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalConsoleIllumination=Hibrido + ConsoleIllumination;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                        Console Illumination $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalConsoleIllumination );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalCargoOrganizer=Hibrido + CargoOrganizer;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                             Cargo Organizer $$" + CargoOrganizer);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoOrganizer );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 5:
                                    float PrecioTotalDoorPanelProtector=Hibrido + DoorPanelProtector;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                        Door Panel Protector $$" + DoorPanelProtector);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorPanelProtector );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 6:
                                    float PrecioTotalArmrestCompartiment=Hibrido + ArmrestCompartiment;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                        Armrest Compartiment $$" + ArmrestCompartiment);
                                    System.out.println("Total:..................................................$$" + PrecioTotalArmrestCompartiment );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 7:
                                    float PrecioTotalDoorSillTrim=Hibrido + DoorSillTrim;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                              Door Sill Trim $$" + DoorSillTrim);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorSillTrim );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 8:
                                    float PrecioTotalCargoCover=Hibrido + CargoCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 Cargo Cover $$" + CargoCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoCover );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 9:
                                    float PrecioTotalCargoLiner=Hibrido + CargoLiner;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 Cargo Liner $$" + CargoLiner);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoLiner );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                                }
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD ACCESORIOS ELECTRONICOS
                                    //*****************
                                    break;
                                    case 6:
                                    opcion=ACElectronicos();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalWirelessPhoneCharger=Hibrido + WirelessPhoneCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                      Wireless Phone Charger $$" + WirelessPhoneCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalWirelessPhoneCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                     case 2:
                                    float PrecioTotalUSBCharger=Hibrido + USBCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                 USB Charger $$" + USBCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalUSBCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalPuddleLight=Hibrido + PuddleLight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                                Puddle Light $$" + PuddleLight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalPuddleLight );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalParkingSensors=Hibrido + ParkingSensors;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                              Hibrido $$"+Hibrido);
                                    System.out.println("Amenidades:                             Parking Sensors $$" + ParkingSensors);
                                    System.out.println("Total:..................................................$$" + PrecioTotalParkingSensors );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                                }
                                    break;
                                                }
                                    break;
                                       }

                                    break;                                     
                               
          
                        }while (opcion!=10);
            
            
            break;
        
            
            
            
        ////**********************************////
        //// QUINTO AUTOMOVIL
        ////**********************************////  
            
            
            
        case 5:
           
         do{
                 
                opcion=Menu();
                switch(opcion){
                     case 1:
                        
                        opcion=Amenidades();
                            switch(opcion){
                             //****PARA PODER TENER EL PRECIO DE CON AMENIDAD TRANSMISION****//
                            case 1:
                            opcion=Transmision();
                                switch(opcion){
                                    case 1:
                                    float PrecioTotalManual=Coupe + Manual;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                          Transmisión Manual $$" + Manual);
                                    System.out.println("Total:..................................................$$" + PrecioTotalManual );
                                    System.out.println("1.- Regresar al menu principal");                                                     
                                    break;
                                    case 2:
                                    float PrecioTotalCVT=Coupe + CVT;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                             Transmisión CVT $$" + CVT);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCVT );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalManualTurbo=Coupe + ManualTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                   Transmisión Manual Turbo $$" + ManualTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalManualTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalCVTTurbo=Coupe + CVTTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                      Transmisión CVT Turbo $$" + CVTTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalCVTTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR EXTERIOR
                                    //*****************
                                    case 2:
                                    opcion=ColorExterior();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCosmicBlue=Coupe + CosmicBlue;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 Cosmic Blue $$" + CosmicBlue );
                                    System.out.println("Total:..................................................$$"  + PrecioTotalCosmicBlue );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalBurgundyNight=Coupe + BurgundyNight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                              Burgundy Night $$" + BurgundyNight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBurgundyNight );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalRallyeRed=Coupe + RallyeRed;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                  Rallye Red $$" + RallyeRed);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRallyeRed );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalModernSteel=Coupe + ModernSteel;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                Modern Steel $$" + ModernSteel);
                                    System.out.println("Total:..................................................$$" + PrecioTotalModernSteel );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalTaffetaWhite=Coupe + TaffetaWhite;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                               Taffeta White $$" + TaffetaWhite);
                                    System.out.println("Total:..................................................$$" + PrecioTotalTaffetaWhite );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalEnergyGreen=Coupe + EnergyGreen;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                Energy Green $$" + EnergyGreen);
                                    System.out.println("Total:..................................................$$" + PrecioTotalEnergyGreen );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalKonaCoffee=Coupe + KonaCoffee;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 Kona Coffee $$" + KonaCoffee);
                                    System.out.println("Total:..................................................$$" + PrecioTotalKonaCoffee );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalOrangeFury=Coupe + OrangeFury;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 Orange Fury $$" + OrangeFury);
                                    System.out.println("Total:..................................................$$"+ PrecioTotalOrangeFury );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalHeliosYellow=Coupe + HeliosYellow;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                               Helios Yellow $$" + HeliosYellow );
                                    System.out.println("Total:..................................................$$" + PrecioTotalHeliosYellow );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalSonicGray=Coupe + SonicGray;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                  Sonic Gray $$" + SonicGray);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSonicGray );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 11:
                                    float PrecioTotalPolishedMetal=Coupe + PolishedMetal;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                              Polished Metal $$ + PolishedMetal");
                                    System.out.println("Total:..................................................$$" + PrecioTotalPolishedMetal );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                                }
                                    break;
                                    //*************
                                    //PARA PODE TENER EL PRECIO DE AMENIDAD MAS AROS
                                    //*************
                                    case 3:
                                    opcion=Aros();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalQuinPulgadas=Coupe + QuinPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 15 Pulgadas $$" + QuinPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalQuinPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 2:
                                    float PrecioTotalDieciPulgadas=Coupe + DieciPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 16 Pulgadas $$" + DieciPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 3:
                                    float PrecioTotalDiecisiPulgadas=Coupe + DiecisiPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 17 Pulgadas $$"+ DiecisiPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecisiPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 4:
                                    float PrecioTotalDieciochPulgadas=Coupe + DieciochPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 18 Pulgadas $$" + DieciochPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciochPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 5:
                                    float PrecioTotalDiecinuePulgadas=Coupe + DiecinuePulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 19 Pulgadas $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecinuePulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*************
                                    // PARA PODER TENER EL PRECIO CON AMENIDAD DE ACCESORIOS EXTERIORES
                                    //*************
                                    case 4:
                                    opcion=ACExteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCarCover=Coupe + CarCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                   Car Cover $$" + CarCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCarCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalDecklidSpoiler=Coupe + DecklidSpoiler;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                             Decklid Spoiler $$" + DecklidSpoiler);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDecklidSpoiler );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalDoorEdgeFilm=Coupe + DoorEdgeFilm;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                              Door Edge Film $$" + DoorEdgeFilm);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeFilm );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalDoorEdgeGuards=Coupe + DoorEdgeGuards;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                            Door Edge Guards $$" + DoorEdgeGuards);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeGuards );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalDoorTrimChrome=Coupe + DoorTrimChrome;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                            Door Trim Chrome $$" + DoorTrimChrome);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorTrimChrome );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalDoorVisor=Coupe + DoorVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                  Door Visor $$" + DoorVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalFrontFenderEmblems=Coupe + FrontFenderEmblems;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                        Front Fender Emblems $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFrontFenderEmblems );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalRearBumperApplique=Coupe + RearBumperApplique;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                        Rear Bumper Applique $$" + RearBumperApplique);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRearBumperApplique );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalFogLights=Coupe + FogLights;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                  Fog Lights $$" + FogLights);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFogLights );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalNoseMascs=Coupe + NoseMascs;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                  Nose Mascs $$" + NoseMascs);
                                    System.out.println("Total:..................................................$$" + PrecioTotalNoseMascs );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;                                                 
                                    case 11:
                                    float PrecioTotalMoonrofVisor=Coupe + MoonrofVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                               Moonrof Visor $$" + MoonrofVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalMoonrofVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 12:
                                    float PrecioTotalSplashGuardSet=Coupe + SplashGuardSet;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                             Splash GuardSet $$" + SplashGuardSet);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSplashGuardSet );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 13:
                                    float PrecioTotalDustCover=Coupe + DustCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                  Dust Cover $$" + DustCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDustCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 14:
                                    float PrecioTotalDoorMirrorCover=Coupe + DoorMirrorCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                           Door Mirror Cover $$" + DoorMirrorCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorMirrorCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 15:
                                    float PrecioTotalBodySideMolding=Coupe + BodySideMolding;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                           Body Side Molding $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBodySideMolding );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                     }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR INTERIOR
                                    //*****************
                                    case 5:
                                    opcion=ACInteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalAllSeasonsFloorMats=Coupe + AllSeasonsFloorMats;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                      All Seasons Floor Mats $$" + AllSeasonsFloorMats);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAllSeasonsFloorMats );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 2:
                                    float PrecioTotalAutomaticDimmingMirror=Coupe + AutomaticDimmingMirror;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                    Automatic Dimming Mirror $$" + AutomaticDimmingMirror);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAutomaticDimmingMirror );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalConsoleIllumination=Coupe + ConsoleIllumination;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                        Console Illumination $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalConsoleIllumination );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalCargoOrganizer=Coupe + CargoOrganizer;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                             Cargo Organizer $$" + CargoOrganizer);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoOrganizer );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 5:
                                    float PrecioTotalDoorPanelProtector=Coupe + DoorPanelProtector;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                        Door Panel Protector $$" + DoorPanelProtector);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorPanelProtector );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 6:
                                    float PrecioTotalArmrestCompartiment=Coupe + ArmrestCompartiment;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                        Armrest Compartiment $$" + ArmrestCompartiment);
                                    System.out.println("Total:..................................................$$" + PrecioTotalArmrestCompartiment );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 7:
                                    float PrecioTotalDoorSillTrim=Coupe + DoorSillTrim;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                              Door Sill Trim $$" + DoorSillTrim);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorSillTrim );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 8:
                                    float PrecioTotalCargoCover=Coupe + CargoCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 Cargo Cover $$" + CargoCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoCover );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 9:
                                    float PrecioTotalCargoLiner=Coupe + CargoLiner;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 Cargo Liner $$" + CargoLiner);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoLiner );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                                }
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD ACCESORIOS ELECTRONICOS
                                    //*****************
                                    break;
                                    case 6:
                                    opcion=ACElectronicos();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalWirelessPhoneCharger=Coupe + WirelessPhoneCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                      Wireless Phone Charger $$" + WirelessPhoneCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalWirelessPhoneCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                     case 2:
                                    float PrecioTotalUSBCharger=Coupe + USBCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                 USB Charger $$" + USBCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalUSBCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalPuddleLight=Coupe + PuddleLight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                Puddle Light $$" + PuddleLight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalPuddleLight );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalParkingSensors=Coupe + ParkingSensors;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                             Parking Sensors $$" + ParkingSensors);
                                    System.out.println("Total:..................................................$$" + PrecioTotalParkingSensors );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                                }
                                    break;
                                                }
                                    break;
                                       }

                                    break;                                     
                               
          
                        }while (opcion!=10);
            
            
            break;   
            
        ////**********************************////
        //// SEXTO AUTOMOVIL
        ////**********************************////      
            
            
        case 6:
            
            do{
                 
                opcion=Menu();
                switch(opcion){
                     case 1:
                        
                        opcion=Amenidades();
                            switch(opcion){
                             //****PARA PODER TENER EL PRECIO DE CON AMENIDAD TRANSMISION****//
                            case 1:
                            opcion=Transmision();
                                switch(opcion){
                                    case 1:
                                    float PrecioTotalManual=CoupeDeportivo + Manual;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                          Transmisión Manual $$" + Manual);
                                    System.out.println("Total:..................................................$$" + PrecioTotalManual );
                                    System.out.println("1.- Regresar al menu principal");                                                     
                                    break;
                                    case 2:
                                    float PrecioTotalCVT=CoupeDeportivo + CVT;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                             Transmisión CVT $$" + CVT);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCVT );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalManualTurbo=CoupeDeportivo + ManualTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                   Transmisión Manual Turbo $$" + ManualTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalManualTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalCVTTurbo=CoupeDeportivo + CVTTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                      Transmisión CVT Turbo $$" + CVTTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalCVTTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR EXTERIOR
                                    //*****************
                                    case 2:
                                    opcion=ColorExterior();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCosmicBlue=CoupeDeportivo + CosmicBlue;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 Cosmic Blue $$" + CosmicBlue );
                                    System.out.println("Total:..................................................$$"  + PrecioTotalCosmicBlue );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalBurgundyNight=CoupeDeportivo + BurgundyNight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                              Burgundy Night $$" + BurgundyNight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBurgundyNight );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalRallyeRed=CoupeDeportivo + RallyeRed;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                  Rallye Red $$" + RallyeRed);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRallyeRed );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalModernSteel=CoupeDeportivo + ModernSteel;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                                Coupe $$"+Coupe);
                                    System.out.println("Amenidades:                                Modern Steel $$" + ModernSteel);
                                    System.out.println("Total:..................................................$$" + PrecioTotalModernSteel );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalTaffetaWhite=CoupeDeportivo + TaffetaWhite;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                               Taffeta White $$" + TaffetaWhite);
                                    System.out.println("Total:..................................................$$" + PrecioTotalTaffetaWhite );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalEnergyGreen=CoupeDeportivo + EnergyGreen;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                Energy Green $$" + EnergyGreen);
                                    System.out.println("Total:..................................................$$" + PrecioTotalEnergyGreen );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalKonaCoffee=CoupeDeportivo + KonaCoffee;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 Kona Coffee $$" + KonaCoffee);
                                    System.out.println("Total:..................................................$$" + PrecioTotalKonaCoffee );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalOrangeFury=CoupeDeportivo + OrangeFury;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 Orange Fury $$" + OrangeFury);
                                    System.out.println("Total:..................................................$$"+ PrecioTotalOrangeFury );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalHeliosYellow=CoupeDeportivo + HeliosYellow;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                               Helios Yellow $$" + HeliosYellow );
                                    System.out.println("Total:..................................................$$" + PrecioTotalHeliosYellow );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalSonicGray=CoupeDeportivo + SonicGray;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                  Sonic Gray $$" + SonicGray);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSonicGray );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 11:
                                    float PrecioTotalPolishedMetal=CoupeDeportivo + PolishedMetal;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                              Polished Metal $$ + PolishedMetal");
                                    System.out.println("Total:..................................................$$" + PrecioTotalPolishedMetal );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                                }
                                    break;
                                    //*************
                                    //PARA PODE TENER EL PRECIO DE AMENIDAD MAS AROS
                                    //*************
                                    case 3:
                                    opcion=Aros();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalQuinPulgadas=CoupeDeportivo + QuinPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 15 Pulgadas $$" + QuinPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalQuinPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 2:
                                    float PrecioTotalDieciPulgadas=CoupeDeportivo + DieciPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 16 Pulgadas $$" + DieciPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 3:
                                    float PrecioTotalDiecisiPulgadas=CoupeDeportivo + DiecisiPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 17 Pulgadas $$"+ DiecisiPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecisiPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 4:
                                    float PrecioTotalDieciochPulgadas=CoupeDeportivo + DieciochPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 18 Pulgadas $$" + DieciochPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciochPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 5:
                                    float PrecioTotalDiecinuePulgadas=CoupeDeportivo + DiecinuePulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 19 Pulgadas $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecinuePulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*************
                                    // PARA PODER TENER EL PRECIO CON AMENIDAD DE ACCESORIOS EXTERIORES
                                    //*************
                                    case 4:
                                    opcion=ACExteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCarCover=CoupeDeportivo + CarCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                   Car Cover $$" + CarCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCarCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalDecklidSpoiler=CoupeDeportivo + DecklidSpoiler;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                             Decklid Spoiler $$" + DecklidSpoiler);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDecklidSpoiler );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalDoorEdgeFilm=CoupeDeportivo + DoorEdgeFilm;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                              Door Edge Film $$" + DoorEdgeFilm);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeFilm );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalDoorEdgeGuards=CoupeDeportivo + DoorEdgeGuards;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                            Door Edge Guards $$" + DoorEdgeGuards);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeGuards );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalDoorTrimChrome=CoupeDeportivo + DoorTrimChrome;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                            Door Trim Chrome $$" + DoorTrimChrome);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorTrimChrome );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalDoorVisor=CoupeDeportivo + DoorVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                  Door Visor $$" + DoorVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalFrontFenderEmblems=CoupeDeportivo + FrontFenderEmblems;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                        Front Fender Emblems $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFrontFenderEmblems );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalRearBumperApplique=CoupeDeportivo + RearBumperApplique;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                        Rear Bumper Applique $$" + RearBumperApplique);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRearBumperApplique );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalFogLights=CoupeDeportivo + FogLights;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                  Fog Lights $$" + FogLights);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFogLights );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalNoseMascs=CoupeDeportivo + NoseMascs;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                  Nose Mascs $$" + NoseMascs);
                                    System.out.println("Total:..................................................$$" + PrecioTotalNoseMascs );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;                                                 
                                    case 11:
                                    float PrecioTotalMoonrofVisor=CoupeDeportivo + MoonrofVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                               Moonrof Visor $$" + MoonrofVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalMoonrofVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 12:
                                    float PrecioTotalSplashGuardSet=CoupeDeportivo + SplashGuardSet;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                             Splash GuardSet $$" + SplashGuardSet);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSplashGuardSet );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 13:
                                    float PrecioTotalDustCover=CoupeDeportivo + DustCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                  Dust Cover $$" + DustCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDustCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 14:
                                    float PrecioTotalDoorMirrorCover=CoupeDeportivo + DoorMirrorCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                           Door Mirror Cover $$" + DoorMirrorCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorMirrorCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 15:
                                    float PrecioTotalBodySideMolding=CoupeDeportivo + BodySideMolding;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                           Body Side Molding $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBodySideMolding );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                     }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR INTERIOR
                                    //*****************
                                    case 5:
                                    opcion=ACInteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalAllSeasonsFloorMats=CoupeDeportivo + AllSeasonsFloorMats;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                      All Seasons Floor Mats $$" + AllSeasonsFloorMats);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAllSeasonsFloorMats );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 2:
                                    float PrecioTotalAutomaticDimmingMirror=CoupeDeportivo + AutomaticDimmingMirror;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                    Automatic Dimming Mirror $$" + AutomaticDimmingMirror);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAutomaticDimmingMirror );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalConsoleIllumination=CoupeDeportivo + ConsoleIllumination;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                        Console Illumination $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalConsoleIllumination );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalCargoOrganizer=CoupeDeportivo + CargoOrganizer;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                             Cargo Organizer $$" + CargoOrganizer);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoOrganizer );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 5:
                                    float PrecioTotalDoorPanelProtector=CoupeDeportivo + DoorPanelProtector;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                        Door Panel Protector $$" + DoorPanelProtector);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorPanelProtector );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 6:
                                    float PrecioTotalArmrestCompartiment=CoupeDeportivo + ArmrestCompartiment;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                        Armrest Compartiment $$" + ArmrestCompartiment);
                                    System.out.println("Total:..................................................$$" + PrecioTotalArmrestCompartiment );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 7:
                                    float PrecioTotalDoorSillTrim=CoupeDeportivo + DoorSillTrim;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                              Door Sill Trim $$" + DoorSillTrim);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorSillTrim );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 8:
                                    float PrecioTotalCargoCover=CoupeDeportivo + CargoCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 Cargo Cover $$" + CargoCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoCover );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 9:
                                    float PrecioTotalCargoLiner=CoupeDeportivo + CargoLiner;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 Cargo Liner $$" + CargoLiner);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoLiner );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                                }
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD ACCESORIOS ELECTRONICOS
                                    //*****************
                                    break;
                                    case 6:
                                    opcion=ACElectronicos();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalWirelessPhoneCharger=CoupeDeportivo + WirelessPhoneCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                      Wireless Phone Charger $$" + WirelessPhoneCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalWirelessPhoneCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                     case 2:
                                    float PrecioTotalUSBCharger=CoupeDeportivo + USBCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                 USB Charger $$" + USBCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalUSBCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalPuddleLight=CoupeDeportivo + PuddleLight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                                Puddle Light $$" + PuddleLight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalPuddleLight );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalParkingSensors=CoupeDeportivo + ParkingSensors;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                      Coupe Deportivo $$"+CoupeDeportivo);
                                    System.out.println("Amenidades:                             Parking Sensors $$" + ParkingSensors);
                                    System.out.println("Total:..................................................$$" + PrecioTotalParkingSensors );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                                }
                                    break;
                                                }
                                    break;
                                       }

                                    break;                                     
                               
          
                        }while (opcion!=10);
            
            
            break; 
        
            
            
            
        ////**********************************////
        //// SEPTIEMO AUTOMOVIL
        ////**********************************////    
            
            
            
            
        case 7:
            
            do{
                 
                opcion=Menu();
                switch(opcion){
                     case 1:
                        
                        opcion=Amenidades();
                            switch(opcion){
                             //****PARA PODER TENER EL PRECIO DE CON AMENIDAD TRANSMISION****//
                            case 1:
                            opcion=Transmision();
                                switch(opcion){
                                    case 1:
                                    float PrecioTotalManual=Compacto + Manual;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                          Transmisión Manual $$" + Manual);
                                    System.out.println("Total:..................................................$$" + PrecioTotalManual );
                                    System.out.println("1.- Regresar al menu principal");                                                     
                                    break;
                                    case 2:
                                    float PrecioTotalCVT=Compacto + CVT;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                             Transmisión CVT $$" + CVT);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCVT );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalManualTurbo=Compacto + ManualTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                   Transmisión Manual Turbo $$" + ManualTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalManualTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalCVTTurbo=Compacto + CVTTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                      Transmisión CVT Turbo $$" + CVTTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalCVTTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR EXTERIOR
                                    //*****************
                                    case 2:
                                    opcion=ColorExterior();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCosmicBlue=Compacto + CosmicBlue;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 Cosmic Blue $$" + CosmicBlue );
                                    System.out.println("Total:..................................................$$"  + PrecioTotalCosmicBlue );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalBurgundyNight=Compacto + BurgundyNight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                              Burgundy Night $$" + BurgundyNight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBurgundyNight );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalRallyeRed=Compacto + RallyeRed;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                  Rallye Red $$" + RallyeRed);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRallyeRed );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalModernSteel=Compacto + ModernSteel;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                Modern Steel $$" + ModernSteel);
                                    System.out.println("Total:..................................................$$" + PrecioTotalModernSteel );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalTaffetaWhite=Compacto + TaffetaWhite;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                               Taffeta White $$" + TaffetaWhite);
                                    System.out.println("Total:..................................................$$" + PrecioTotalTaffetaWhite );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalEnergyGreen=Compacto + EnergyGreen;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                Energy Green $$" + EnergyGreen);
                                    System.out.println("Total:..................................................$$" + PrecioTotalEnergyGreen );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalKonaCoffee=Compacto + KonaCoffee;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 Kona Coffee $$" + KonaCoffee);
                                    System.out.println("Total:..................................................$$" + PrecioTotalKonaCoffee );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalOrangeFury=Compacto + OrangeFury;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 Orange Fury $$" + OrangeFury);
                                    System.out.println("Total:..................................................$$"+ PrecioTotalOrangeFury );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalHeliosYellow=Compacto + HeliosYellow;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                               Helios Yellow $$" + HeliosYellow );
                                    System.out.println("Total:..................................................$$" + PrecioTotalHeliosYellow );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalSonicGray=Compacto + SonicGray;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                  Sonic Gray $$" + SonicGray);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSonicGray );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 11:
                                    float PrecioTotalPolishedMetal=Compacto + PolishedMetal;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                              Polished Metal $$ + PolishedMetal");
                                    System.out.println("Total:..................................................$$" + PrecioTotalPolishedMetal );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                                }
                                    break;
                                    //*************
                                    //PARA PODE TENER EL PRECIO DE AMENIDAD MAS AROS
                                    //*************
                                    case 3:
                                    opcion=Aros();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalQuinPulgadas=Compacto + QuinPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 15 Pulgadas $$" + QuinPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalQuinPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 2:
                                    float PrecioTotalDieciPulgadas=Compacto + DieciPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 16 Pulgadas $$" + DieciPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 3:
                                    float PrecioTotalDiecisiPulgadas=Compacto + DiecisiPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 17 Pulgadas $$"+ DiecisiPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecisiPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 4:
                                    float PrecioTotalDieciochPulgadas=Compacto + DieciochPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 18 Pulgadas $$" + DieciochPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciochPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 5:
                                    float PrecioTotalDiecinuePulgadas=Compacto + DiecinuePulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 19 Pulgadas $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecinuePulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*************
                                    // PARA PODER TENER EL PRECIO CON AMENIDAD DE ACCESORIOS EXTERIORES
                                    //*************
                                    case 4:
                                    opcion=ACExteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCarCover=Compacto + CarCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                   Car Cover $$" + CarCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCarCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalDecklidSpoiler=Compacto + DecklidSpoiler;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                             Decklid Spoiler $$" + DecklidSpoiler);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDecklidSpoiler );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalDoorEdgeFilm=Compacto + DoorEdgeFilm;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                              Door Edge Film $$" + DoorEdgeFilm);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeFilm );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalDoorEdgeGuards=Coupe + DoorEdgeGuards;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                            Door Edge Guards $$" + DoorEdgeGuards);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeGuards );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalDoorTrimChrome=Compacto + DoorTrimChrome;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                            Door Trim Chrome $$" + DoorTrimChrome);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorTrimChrome );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalDoorVisor=Compacto + DoorVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                  Door Visor $$" + DoorVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalFrontFenderEmblems=Compacto + FrontFenderEmblems;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                        Front Fender Emblems $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFrontFenderEmblems );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalRearBumperApplique=Compacto + RearBumperApplique;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                        Rear Bumper Applique $$" + RearBumperApplique);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRearBumperApplique );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalFogLights=Compacto + FogLights;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                  Fog Lights $$" + FogLights);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFogLights );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalNoseMascs=Compacto + NoseMascs;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                  Nose Mascs $$" + NoseMascs);
                                    System.out.println("Total:..................................................$$" + PrecioTotalNoseMascs );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;                                                 
                                    case 11:
                                    float PrecioTotalMoonrofVisor=Compacto + MoonrofVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                               Moonrof Visor $$" + MoonrofVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalMoonrofVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 12:
                                    float PrecioTotalSplashGuardSet=Compacto + SplashGuardSet;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                             Splash GuardSet $$" + SplashGuardSet);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSplashGuardSet );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 13:
                                    float PrecioTotalDustCover=Compacto + DustCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                  Dust Cover $$" + DustCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDustCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 14:
                                    float PrecioTotalDoorMirrorCover=Compacto + DoorMirrorCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                           Door Mirror Cover $$" + DoorMirrorCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorMirrorCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 15:
                                    float PrecioTotalBodySideMolding=Compacto + BodySideMolding;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                           Body Side Molding $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBodySideMolding );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                     }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR INTERIOR
                                    //*****************
                                    case 5:
                                    opcion=ACInteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalAllSeasonsFloorMats=Compacto + AllSeasonsFloorMats;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                      All Seasons Floor Mats $$" + AllSeasonsFloorMats);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAllSeasonsFloorMats );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 2:
                                    float PrecioTotalAutomaticDimmingMirror=Compacto + AutomaticDimmingMirror;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                    Automatic Dimming Mirror $$" + AutomaticDimmingMirror);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAutomaticDimmingMirror );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalConsoleIllumination=Compacto + ConsoleIllumination;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                        Console Illumination $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalConsoleIllumination );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalCargoOrganizer=Compacto + CargoOrganizer;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                             Cargo Organizer $$" + CargoOrganizer);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoOrganizer );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 5:
                                    float PrecioTotalDoorPanelProtector=Compacto + DoorPanelProtector;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                        Door Panel Protector $$" + DoorPanelProtector);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorPanelProtector );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 6:
                                    float PrecioTotalArmrestCompartiment=Compacto + ArmrestCompartiment;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                        Armrest Compartiment $$" + ArmrestCompartiment);
                                    System.out.println("Total:..................................................$$" + PrecioTotalArmrestCompartiment );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 7:
                                    float PrecioTotalDoorSillTrim=Compacto + DoorSillTrim;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                              Door Sill Trim $$" + DoorSillTrim);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorSillTrim );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 8:
                                    float PrecioTotalCargoCover=Compacto + CargoCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 Cargo Cover $$" + CargoCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoCover );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 9:
                                    float PrecioTotalCargoLiner=Compacto + CargoLiner;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 Cargo Liner $$" + CargoLiner);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoLiner );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                                }
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD ACCESORIOS ELECTRONICOS
                                    //*****************
                                    break;
                                    case 6:
                                    opcion=ACElectronicos();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalWirelessPhoneCharger=Compacto + WirelessPhoneCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                      Wireless Phone Charger $$" + WirelessPhoneCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalWirelessPhoneCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                     case 2:
                                    float PrecioTotalUSBCharger=Compacto + USBCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                 USB Charger $$" + USBCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalUSBCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalPuddleLight=Compacto + PuddleLight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                                Puddle Light $$" + PuddleLight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalPuddleLight );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalParkingSensors=Compacto + ParkingSensors;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                             Compacto $$"+Compacto);
                                    System.out.println("Amenidades:                             Parking Sensors $$" + ParkingSensors);
                                    System.out.println("Total:..................................................$$" + PrecioTotalParkingSensors );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                                }
                                    break;
                                                }
                                    break;
                                       }

                                    break;                                     
                               
          
                        }while (opcion!=10);
            
            
            break;   
            
        ////**********************************////
        //// OCTAVO AUTOMOVIL
        ////**********************************////      
            
            
        case 8:
            
            do{
                 
                opcion=Menu();
                switch(opcion){
                     case 1:
                        
                        opcion=Amenidades();
                            switch(opcion){
                             //****PARA PODER TENER EL PRECIO DE CON AMENIDAD TRANSMISION****//
                            case 1:
                            opcion=Transmision();
                                switch(opcion){
                                    case 1:
                                    float PrecioTotalManual=Hatchback + Manual;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                          Transmisión Manual $$" + Manual);
                                    System.out.println("Total:..................................................$$" + PrecioTotalManual );
                                    System.out.println("1.- Regresar al menu principal");                                                     
                                    break;
                                    case 2:
                                    float PrecioTotalCVT=Hatchback + CVT;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                             Transmisión CVT $$" + CVT);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCVT );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalManualTurbo=Hatchback + ManualTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                   Transmisión Manual Turbo $$" + ManualTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalManualTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalCVTTurbo=Hatchback + CVTTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                      Transmisión CVT Turbo $$" + CVTTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalCVTTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR EXTERIOR
                                    //*****************
                                    case 2:
                                    opcion=ColorExterior();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCosmicBlue=Hatchback + CosmicBlue;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 Cosmic Blue $$" + CosmicBlue );
                                    System.out.println("Total:..................................................$$"  + PrecioTotalCosmicBlue );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalBurgundyNight=Hatchback + BurgundyNight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                              Burgundy Night $$" + BurgundyNight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBurgundyNight );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalRallyeRed=Hatchback + RallyeRed;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Rallye Red $$" + RallyeRed);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRallyeRed );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalModernSteel=Hatchback + ModernSteel;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                Modern Steel $$" + ModernSteel);
                                    System.out.println("Total:..................................................$$" + PrecioTotalModernSteel );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalTaffetaWhite=Hatchback + TaffetaWhite;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                               Taffeta White $$" + TaffetaWhite);
                                    System.out.println("Total:..................................................$$" + PrecioTotalTaffetaWhite );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalEnergyGreen=Hatchback + EnergyGreen;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                Energy Green $$" + EnergyGreen);
                                    System.out.println("Total:..................................................$$" + PrecioTotalEnergyGreen );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalKonaCoffee=Hatchback + KonaCoffee;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 Kona Coffee $$" + KonaCoffee);
                                    System.out.println("Total:..................................................$$" + PrecioTotalKonaCoffee );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalOrangeFury=Hatchback + OrangeFury;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 Orange Fury $$" + OrangeFury);
                                    System.out.println("Total:..................................................$$"+ PrecioTotalOrangeFury );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalHeliosYellow=Hatchback + HeliosYellow;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                               Helios Yellow $$" + HeliosYellow );
                                    System.out.println("Total:..................................................$$" + PrecioTotalHeliosYellow );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalSonicGray=Hatchback + SonicGray;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Sonic Gray $$" + SonicGray);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSonicGray );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 11:
                                    float PrecioTotalPolishedMetal=Hatchback + PolishedMetal;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                              Polished Metal $$ + PolishedMetal");
                                    System.out.println("Total:..................................................$$" + PrecioTotalPolishedMetal );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                                }
                                    break;
                                    //*************
                                    //PARA PODE TENER EL PRECIO DE AMENIDAD MAS AROS
                                    //*************
                                    case 3:
                                    opcion=Aros();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalQuinPulgadas=Hatchback + QuinPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 15 Pulgadas $$" + QuinPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalQuinPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 2:
                                    float PrecioTotalDieciPulgadas=Hatchback + DieciPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 16 Pulgadas $$" + DieciPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 3:
                                    float PrecioTotalDiecisiPulgadas=Hatchback + DiecisiPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 17 Pulgadas $$"+ DiecisiPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecisiPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 4:
                                    float PrecioTotalDieciochPulgadas=Hatchback + DieciochPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 18 Pulgadas $$" + DieciochPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciochPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 5:
                                    float PrecioTotalDiecinuePulgadas=Hatchback + DiecinuePulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 19 Pulgadas $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecinuePulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*************
                                    // PARA PODER TENER EL PRECIO CON AMENIDAD DE ACCESORIOS EXTERIORES
                                    //*************
                                    case 4:
                                    opcion=ACExteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCarCover=Hatchback + CarCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                   Car Cover $$" + CarCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCarCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalDecklidSpoiler=Hatchback + DecklidSpoiler;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                             Decklid Spoiler $$" + DecklidSpoiler);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDecklidSpoiler );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalDoorEdgeFilm=Hatchback + DoorEdgeFilm;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                              Door Edge Film $$" + DoorEdgeFilm);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeFilm );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalDoorEdgeGuards=Hatchback + DoorEdgeGuards;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                            Door Edge Guards $$" + DoorEdgeGuards);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeGuards );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalDoorTrimChrome=Hatchback + DoorTrimChrome;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                            Door Trim Chrome $$" + DoorTrimChrome);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorTrimChrome );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalDoorVisor=Hatchback + DoorVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Door Visor $$" + DoorVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalFrontFenderEmblems=Hatchback + FrontFenderEmblems;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                        Front Fender Emblems $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFrontFenderEmblems );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalRearBumperApplique=Hatchback + RearBumperApplique;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                        Rear Bumper Applique $$" + RearBumperApplique);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRearBumperApplique );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalFogLights=Hatchback + FogLights;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Fog Lights $$" + FogLights);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFogLights );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalNoseMascs=Hatchback + NoseMascs;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Nose Mascs $$" + NoseMascs);
                                    System.out.println("Total:..................................................$$" + PrecioTotalNoseMascs );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;                                                 
                                    case 11:
                                    float PrecioTotalMoonrofVisor=Hatchback + MoonrofVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                               Moonrof Visor $$" + MoonrofVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalMoonrofVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 12:
                                    float PrecioTotalSplashGuardSet=Hatchback + SplashGuardSet;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                             Splash GuardSet $$" + SplashGuardSet);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSplashGuardSet );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 13:
                                    float PrecioTotalDustCover=Hatchback + DustCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Dust Cover $$" + DustCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDustCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 14:
                                    float PrecioTotalDoorMirrorCover=Hatchback + DoorMirrorCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                           Door Mirror Cover $$" + DoorMirrorCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorMirrorCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 15:
                                    float PrecioTotalBodySideMolding=Hatchback + BodySideMolding;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                           Body Side Molding $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBodySideMolding );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                     }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR INTERIOR
                                    //*****************
                                    case 5:
                                    opcion=ACInteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalAllSeasonsFloorMats=Hatchback + AllSeasonsFloorMats;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                      All Seasons Floor Mats $$" + AllSeasonsFloorMats);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAllSeasonsFloorMats );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 2:
                                    float PrecioTotalAutomaticDimmingMirror=Hatchback + AutomaticDimmingMirror;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                    Automatic Dimming Mirror $$" + AutomaticDimmingMirror);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAutomaticDimmingMirror );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalConsoleIllumination=Hatchback + ConsoleIllumination;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                        Console Illumination $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalConsoleIllumination );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalCargoOrganizer=Hatchback + CargoOrganizer;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                             Cargo Organizer $$" + CargoOrganizer);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoOrganizer );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 5:
                                    float PrecioTotalDoorPanelProtector=Hatchback + DoorPanelProtector;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                        Door Panel Protector $$" + DoorPanelProtector);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorPanelProtector );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 6:
                                    float PrecioTotalArmrestCompartiment=Hatchback + ArmrestCompartiment;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                        Armrest Compartiment $$" + ArmrestCompartiment);
                                    System.out.println("Total:..................................................$$" + PrecioTotalArmrestCompartiment );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 7:
                                    float PrecioTotalDoorSillTrim=Hatchback + DoorSillTrim;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                              Door Sill Trim $$" + DoorSillTrim);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorSillTrim );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 8:
                                    float PrecioTotalCargoCover=Hatchback + CargoCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 Cargo Cover $$" + CargoCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoCover );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 9:
                                    float PrecioTotalCargoLiner=Hatchback + CargoLiner;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 Cargo Liner $$" + CargoLiner);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoLiner );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                                }
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD ACCESORIOS ELECTRONICOS
                                    //*****************
                                    break;
                                    case 6:
                                    opcion=ACElectronicos();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalWirelessPhoneCharger=Hatchback + WirelessPhoneCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                      Wireless Phone Charger $$" + WirelessPhoneCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalWirelessPhoneCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                     case 2:
                                    float PrecioTotalUSBCharger=Hatchback + USBCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 USB Charger $$" + USBCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalUSBCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalPuddleLight=Hatchback + PuddleLight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                Puddle Light $$" + PuddleLight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalPuddleLight );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalParkingSensors=Hatchback + ParkingSensors;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                             Parking Sensors $$" + ParkingSensors);
                                    System.out.println("Total:..................................................$$" + PrecioTotalParkingSensors );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                                }
                                    break;
                                                }
                                    break;
                                       }

                                    break;                                     
                               
          
                        }while (opcion!=10);
            
            
            break; 
            
        ////**********************************////
        //// NOVENO AUTOMOVIL
        ////**********************************//// 
            
        case 9:
            do{
                 
                opcion=Menu();
                switch(opcion){
                     case 1:
                        
                        opcion=Amenidades();
                            switch(opcion){
                             //****PARA PODER TENER EL PRECIO DE CON AMENIDAD TRANSMISION****//
                            case 1:
                            opcion=Transmision();
                                switch(opcion){
                                    case 1:
                                    float PrecioTotalManual=RallyEconomicov + Manual;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:              Rally Versón Economicov $$"+RallyEconomicov);
                                    System.out.println("Amenidades:                          Transmisión Manual $$" + Manual);
                                    System.out.println("Total:..................................................$$" + PrecioTotalManual );
                                    System.out.println("1.- Regresar al menu principal");                                                     
                                    break;
                                    case 2:
                                    float PrecioTotalCVT=RallyEconomicov + CVT;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                             Transmisión CVT $$" + CVT);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCVT );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalManualTurbo=RallyEconomicov + ManualTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                   Transmisión Manual Turbo $$" + ManualTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalManualTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalCVTTurbo=RallyEconomicov + CVTTurbo;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                      Transmisión CVT Turbo $$" + CVTTurbo);
                                    System.out.println("Total:.................................................$$" + PrecioTotalCVTTurbo );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR EXTERIOR
                                    //*****************
                                    case 2:
                                    opcion=ColorExterior();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCosmicBlue=RallyEconomicov + CosmicBlue;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 Cosmic Blue $$" + CosmicBlue );
                                    System.out.println("Total:..................................................$$"  + PrecioTotalCosmicBlue );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalBurgundyNight=RallyEconomicov + BurgundyNight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                              Burgundy Night $$" + BurgundyNight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBurgundyNight );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalRallyeRed=RallyEconomicov + RallyeRed;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Rallye Red $$" + RallyeRed);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRallyeRed );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalModernSteel=RallyEconomicov + ModernSteel;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                Modern Steel $$" + ModernSteel);
                                    System.out.println("Total:..................................................$$" + PrecioTotalModernSteel );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalTaffetaWhite=RallyEconomicov + TaffetaWhite;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                               Taffeta White $$" + TaffetaWhite);
                                    System.out.println("Total:..................................................$$" + PrecioTotalTaffetaWhite );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalEnergyGreen=RallyEconomicov + EnergyGreen;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                Energy Green $$" + EnergyGreen);
                                    System.out.println("Total:..................................................$$" + PrecioTotalEnergyGreen );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalKonaCoffee=RallyEconomicov + KonaCoffee;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 Kona Coffee $$" + KonaCoffee);
                                    System.out.println("Total:..................................................$$" + PrecioTotalKonaCoffee );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalOrangeFury=RallyEconomicov + OrangeFury;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 Orange Fury $$" + OrangeFury);
                                    System.out.println("Total:..................................................$$"+ PrecioTotalOrangeFury );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalHeliosYellow=RallyEconomicov + HeliosYellow;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                               Helios Yellow $$" + HeliosYellow );
                                    System.out.println("Total:..................................................$$" + PrecioTotalHeliosYellow );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalSonicGray=RallyEconomicov + SonicGray;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Sonic Gray $$" + SonicGray);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSonicGray );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 11:
                                    float PrecioTotalPolishedMetal=RallyEconomicov + PolishedMetal;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                              Polished Metal $$ + PolishedMetal");
                                    System.out.println("Total:..................................................$$" + PrecioTotalPolishedMetal );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                                }
                                    break;
                                    //*************
                                    //PARA PODE TENER EL PRECIO DE AMENIDAD MAS AROS
                                    //*************
                                    case 3:
                                    opcion=Aros();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalQuinPulgadas=RallyEconomicov + QuinPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 15 Pulgadas $$" + QuinPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalQuinPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 2:
                                    float PrecioTotalDieciPulgadas=RallyEconomicov + DieciPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 16 Pulgadas $$" + DieciPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 3:
                                    float PrecioTotalDiecisiPulgadas=RallyEconomicov + DiecisiPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 17 Pulgadas $$"+ DiecisiPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecisiPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 4:
                                    float PrecioTotalDieciochPulgadas=RallyEconomicov + DieciochPulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 18 Pulgadas $$" + DieciochPulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDieciochPulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                   case 5:
                                    float PrecioTotalDiecinuePulgadas=RallyEconomicov + DiecinuePulgadas;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 19 Pulgadas $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDiecinuePulgadas );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    }
                                    break;
                                    //*************
                                    // PARA PODER TENER EL PRECIO CON AMENIDAD DE ACCESORIOS EXTERIORES
                                    //*************
                                    case 4:
                                    opcion=ACExteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalCarCover=RallyEconomicov + CarCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                   Car Cover $$" + CarCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCarCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 2:
                                    float PrecioTotalDecklidSpoiler=RallyEconomicov + DecklidSpoiler;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                             Decklid Spoiler $$" + DecklidSpoiler);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDecklidSpoiler );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 3:
                                    float PrecioTotalDoorEdgeFilm=RallyEconomicov + DoorEdgeFilm;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                              Door Edge Film $$" + DoorEdgeFilm);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeFilm );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 4:
                                    float PrecioTotalDoorEdgeGuards=RallyEconomicov + DoorEdgeGuards;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                            Door Edge Guards $$" + DoorEdgeGuards);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorEdgeGuards );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 5:
                                    float PrecioTotalDoorTrimChrome=RallyEconomicov + DoorTrimChrome;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                            Door Trim Chrome $$" + DoorTrimChrome);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorTrimChrome );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 6:
                                    float PrecioTotalDoorVisor=RallyEconomicov + DoorVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Door Visor $$" + DoorVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 7:
                                    float PrecioTotalFrontFenderEmblems=RallyEconomicov + FrontFenderEmblems;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                        Front Fender Emblems $$" + DiecinuePulgadas);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFrontFenderEmblems );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 8:
                                    float PrecioTotalRearBumperApplique=RallyEconomicov + RearBumperApplique;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                        Rear Bumper Applique $$" + RearBumperApplique);
                                    System.out.println("Total:..................................................$$" + PrecioTotalRearBumperApplique );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 9:
                                    float PrecioTotalFogLights=RallyEconomicov + FogLights;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Fog Lights $$" + FogLights);
                                    System.out.println("Total:..................................................$$" + PrecioTotalFogLights );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 10:
                                    float PrecioTotalNoseMascs=RallyEconomicov + NoseMascs;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Nose Mascs $$" + NoseMascs);
                                    System.out.println("Total:..................................................$$" + PrecioTotalNoseMascs );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;                                                 
                                    case 11:
                                    float PrecioTotalMoonrofVisor=RallyEconomicov + MoonrofVisor;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                               Moonrof Visor $$" + MoonrofVisor);
                                    System.out.println("Total:..................................................$$" + PrecioTotalMoonrofVisor );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 12:
                                    float PrecioTotalSplashGuardSet=RallyEconomicov + SplashGuardSet;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                             Splash GuardSet $$" + SplashGuardSet);
                                    System.out.println("Total:..................................................$$" + PrecioTotalSplashGuardSet );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 13:
                                    float PrecioTotalDustCover=RallyEconomicov + DustCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                  Dust Cover $$" + DustCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDustCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 14:
                                    float PrecioTotalDoorMirrorCover=RallyEconomicov + DoorMirrorCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                           Door Mirror Cover $$" + DoorMirrorCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorMirrorCover );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                    case 15:
                                    float PrecioTotalBodySideMolding=RallyEconomicov + BodySideMolding;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                           Body Side Molding $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalBodySideMolding );
                                    System.out.println("1.- Regresar al menu principal");  
                                    break;
                                     }
                                    break;
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD COLOR INTERIOR
                                    //*****************
                                    case 5:
                                    opcion=ACInteriores();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalAllSeasonsFloorMats=RallyEconomicov + AllSeasonsFloorMats;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                      All Seasons Floor Mats $$" + AllSeasonsFloorMats);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAllSeasonsFloorMats );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 2:
                                    float PrecioTotalAutomaticDimmingMirror=RallyEconomicov + AutomaticDimmingMirror;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                    Automatic Dimming Mirror $$" + AutomaticDimmingMirror);
                                    System.out.println("Total:..................................................$$" + PrecioTotalAutomaticDimmingMirror );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalConsoleIllumination=RallyEconomicov + ConsoleIllumination;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                        Console Illumination $$" + BodySideMolding);
                                    System.out.println("Total:..................................................$$" + PrecioTotalConsoleIllumination );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalCargoOrganizer=RallyEconomicov + CargoOrganizer;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                             Cargo Organizer $$" + CargoOrganizer);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoOrganizer );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 5:
                                    float PrecioTotalDoorPanelProtector=RallyEconomicov + DoorPanelProtector;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                        Door Panel Protector $$" + DoorPanelProtector);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorPanelProtector );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 6:
                                    float PrecioTotalArmrestCompartiment=RallyEconomicov + ArmrestCompartiment;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                        Armrest Compartiment $$" + ArmrestCompartiment);
                                    System.out.println("Total:..................................................$$" + PrecioTotalArmrestCompartiment );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 7:
                                    float PrecioTotalDoorSillTrim=RallyEconomicov + DoorSillTrim;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                              Door Sill Trim $$" + DoorSillTrim);
                                    System.out.println("Total:..................................................$$" + PrecioTotalDoorSillTrim );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 8:
                                    float PrecioTotalCargoCover=RallyEconomicov + CargoCover;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 Cargo Cover $$" + CargoCover);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoCover );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 9:
                                    float PrecioTotalCargoLiner=RallyEconomicov + CargoLiner;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 Cargo Liner $$" + CargoLiner);
                                    System.out.println("Total:..................................................$$" + PrecioTotalCargoLiner );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                                }
                                    //*****************   
                                    //PARA PODER TENER EL PRECIO CON AMENIDAD ACCESORIOS ELECTRONICOS
                                    //*****************
                                    break;
                                    case 6:
                                    opcion=ACElectronicos();
                                    switch (opcion){
                                    case 1:
                                    float PrecioTotalWirelessPhoneCharger=RallyEconomicov + WirelessPhoneCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                      Wireless Phone Charger $$" + WirelessPhoneCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalWirelessPhoneCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                     case 2:
                                    float PrecioTotalUSBCharger=RallyEconomicov + USBCharger;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                 USB Charger $$" + USBCharger);
                                    System.out.println("Total:..................................................$$" + PrecioTotalUSBCharger );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 3:
                                    float PrecioTotalPuddleLight=RallyEconomicov + PuddleLight;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                                Puddle Light $$" + PuddleLight);
                                    System.out.println("Total:..................................................$$" + PrecioTotalPuddleLight );
                                    System.out.println("1.- Regresar al menu principal"); 
                                    break;
                                    case 4:
                                    float PrecioTotalParkingSensors=RallyEconomicov + ParkingSensors;
                                    System.out.println("\n \n" + "---------------------------------------------");
                                    System.out.println("CONCESIONARIO DE AUTOS\n" + "-VENTA DE VEHICULO-");
                                    System.out.println("---------------------------------------------");
                                    System.out.println("Gama seleccionada:                            Hatchback $$"+Hatchback);
                                    System.out.println("Amenidades:                             Parking Sensors $$" + ParkingSensors);
                                    System.out.println("Total:..................................................$$" + PrecioTotalParkingSensors );
                                    System.out.println("1.- Regresar al menu principal"); 
                                     break;
                                                }
                                    break;
                                                }
                                    break;
                                       }

                                    break;                                     
                               
          
                        }while (opcion!=10);
            
            
            break; 
            
            
    }
           
            }
        
        }while(opcion!=10);
        
        }
    
    
    
    
    
    
    
    
    
    
    
    //METODO PARA ESCOGER AMENIDADES SI/NO (metodo estatico)
    private static int Menu() {
        System.out.println("\n \n" + "---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE GAMA DE VEHICULO-");
        System.out.println("---------------------------------------------");
        System.out.println("Ha seleccionado la gama:");
        System.out.println("¿Desea agregar ameniades? ( 1 s/ 0 n)");
        int opc=vehiculo.nextInt();               
        return opc ;
    }
    //METODO PARA ESCOGER LAS AMENIDADES (metodo estatico)
    private static int Amenidades() {
    System.out.println("\n \n" + "---------------------------------------------");
    System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE AMENIDADES-");
    System.out.println("---------------------------------------------");
    System.out.println("\nHa seleccionado la gama: " );
    System.out.println("Tipos de Amenidades: \n");
    System.out.println("1.- Tipo de transmisión");
    System.out.println("2.- Color de pintura exterior");
    System.out.println("3.- Aros");
    System.out.println("4.- Accesorios Exteriores");
    System.out.println("5.- Accesorios Interiores");
    System.out.println("6.- Accesorios Eletrónicos");
    System.out.println("7.- Regresar a selección de gama de vehículo");
    System.out.println("Ingrese el ipo de amenidad por favor");
    int opc=vehiculo.nextInt();               
    return opc ;
    }
    //METODO PARA ESCOGER LAS TRANSMISIONES (metodo estatico)
    private static int Transmision() {
        System.out.println("\n \n" + "---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE AMENIDADES-\n" + "-SELECCION DE TIPO DE TRANSMISION-");
       System.out.println("---------------------------------------------");
        System.out.println("1.- Manual");
        System.out.println("2.- CVT");
        System.out.println("3.- Manual con Turbo");
        System.out.println("4.- CVT con Turbo");
        System.out.println("5.- Regresar a selección de amenidades");
        int opc=vehiculo.nextInt();
        return opc ;
    }

    private static int Aros() {
        System.out.println("\n \n" + "---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE AMENIDADES-\n" + "-SELECCION DE AROS-");
        System.out.println("---------------------------------------------");
        System.out.println("1.- 15 Pulgadas");
        System.out.println("2.- 16 Pulgadas");
        System.out.println("3.- 17 Pulgadas");
        System.out.println("4.- 18 Pulgadas");
        System.out.println("5.- 19 Pulgadas");
        int opc=vehiculo.nextInt();
        return opc;
    }

    private static int amenidades() {
        System.out.println("\n \n" + "---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE AMENIDADES-");
        System.out.println("---------------------------------------------");
        System.out.println("\nHa seleccionado la gama: " );
        System.out.println("Tipos de Amenidades: \n");
        System.out.println("1.- Tipo de transmisión");
        System.out.println("2.- Color de pintura exterior");
        System.out.println("3.- Aros");
        System.out.println("4.- Accesorios Exteriores");
        System.out.println("5.- Accesorios Interiores");
        System.out.println("6.- Accesorios Eletrónicos");
        System.out.println("7.- Regresar a selección de gama de vehículo");
        System.out.println("Ingrese el ipo de amenidad por favor");
        int opc=vehiculo.nextInt();                
        return opc;
    }
    private static int tipotransmision() {
        System.out.println("\n \n" + "---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE AMENIDADES-\n" + "-SELECCION DE TIPO DE TRANSMISION-");
        System.out.println("---------------------------------------------");
        System.out.println("1.- Manual");
        System.out.println("2.- CVT");
        System.out.println("3.- Manual con Turbo");
        System.out.println("4.- CVT con Turbo");
        System.out.println("5.- Regresar a selección de amenidades");
        int opc=vehiculo.nextInt();                
        return opc;
    }
    private static int ColorExterior(){
        System.out.println("\n \n" + "---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE AMENIDADES-\n" + "-SELECCION DE TIPO PINTURA EXTERIOR-");
        System.out.println("---------------------------------------------");
        System.out.println("1.- Cosmic Blue");
        System.out.println("2.- Burgundy Night");
        System.out.println("3.- Rallye Red");
        System.out.println("4.- Modern Steel");
        System.out.println("5.- Taffeta White");
        System.out.println("6.- Energy Green");
        System.out.println("7.- Kona Coffee");
        System.out.println("8.- Oragne Fury");
        System.out.println("9.- Helios Yellow");
        System.out.println("10.- Sonic Gray");
        System.out.println("11.- Polished Metal");
        int opc=vehiculo.nextInt();                
        return opc;
    }
    private static int menu() {
        System.out.println("---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + " -MENU PRINCIPAL-");
        System.out.println("---------------------------------------------");
        System.out.println("1.- Seleccionar Automóvil");
        System.out.println("2.- Salir");
        System.out.println("Ingrese una opción por favor");
        int opc=vehiculo.nextInt();
        return opc;
    }

    private static int ACExteriores() {
        System.out.println("\n \n" + "---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE AMENIDADES-\n" + "-ACCESORIOS EXTERIORES-");
        System.out.println("---------------------------------------------");
        System.out.println("1.- Car Cover");
        System.out.println("2.- Decklid Spoiler");
        System.out.println("3.- Door Edge Film");
        System.out.println("4.- Door Edge Guards");
        System.out.println("5.- Door Trim Chrome");
        System.out.println("6.- Door Visor");
        System.out.println("7.- Front Fender Emblems");
        System.out.println("8.- Rear Bumper Applique");
        System.out.println("9.- Fog Lights");
        System.out.println("10.- Nose Mascs");                                                
        System.out.println("11.- Moonrof Visor");
        System.out.println("12.- Splash GuardSet");
        System.out.println("13.- Dust Cover");
        System.out.println("14.- Door Mirror Cover");
        System.out.println("15.- Body Side Molding");
        System.out.println("16.- Regresar a las amenidades");
        int opc=vehiculo.nextInt();
        return opc;
    }

    private static int ACInteriores() {
        System.out.println("\n \n" + "---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE AMENIDADES-\n" + "-SELECCION DE ACCESORIOS INTERIORES-");
        System.out.println("---------------------------------------------");
        System.out.println("1.- All Seasons Floor Mats");
        System.out.println("2.- Automatic Dimming Mirror");
        System.out.println("3.- Console Illumination");
        System.out.println("4.- Cargo Organizer");
        System.out.println("5.- Door Panel Protector");
        System.out.println("6.- Armrest Compartiment");
        System.out.println("7.- Door Sill Trim");
        System.out.println("8.- Cargo Cover");
        System.out.println("9.- Cargo Liner");
        System.out.println("10.- Regresar a las amenidades");
        int opc=vehiculo.nextInt();
        return opc;
    }

    private static int ACElectronicos() {
        System.out.println("\n \n" + "---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE AMENIDADES-\n" + "-SELECCION DE ACCESORIOS ELECTRONICOS-");
        System.out.println("---------------------------------------------");
        System.out.println("1.- Wireless Phone Charger");
        System.out.println("2.- USB Charger - 2.1 Amp.");
        System.out.println("3.- Puddle Light");
        System.out.println("4.- Parking Sensors");
        System.out.println("5.- Regresar a las amenidades ");
        int opc=vehiculo.nextInt();
        return opc;
    }

    private static int Gama() {
        System.out.println("\n \n" + "---------------------------------------------");
        System.out.println("CONCESIONARIO DE AUTOS\n" + "-SELECCION DE GAMA DE VEHICULO-");
        System.out.println("---------------------------------------------");
        System.out.println("1.- Sedán Economico");                    
        System.out.println("2.- Sedan");
        System.out.println("3.- Deportivo");
        System.out.println("4.- Híbrido");
        System.out.println("5.- Coupe");
        System.out.println("6.- Coupe Deportivo");
        System.out.println("7.- Compacto");
        System.out.println("8.- Hatchback");
        System.out.println("9.- Económico versión Rally");
        System.out.println("10.- Regresar a menú principal");
        System.out.println("Ingrese gama de vehículo por favor"); 
        int opc=vehiculo.nextInt();
        return opc;
    }
}