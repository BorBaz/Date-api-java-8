package es.bbs.snippet;

import java.util.Optional;

public final class Snippet {


    public static void hazCosas() {
        Cosa cosa = new Cosa("algo");

//        Optional<Cosa> cosa = obtenerCosa();

        if(new CosaValidator().validate(cosa).isValid()){
            hazAlgoConEstaCosa(cosa);
        }


        try {
            hazAlgoConEstaCosa(cosa);
        } catch (Exception e) {
            System.out.println("La que has liado pollito");
        }

        cosa.setAlgo("A");

        if (cosa != null) {
            hazAlgoMasConEstaCosa(cosa);
            // Turbo
        }else{
            // Atmosferico
        }


    }

    private static Optional<Cosa> obtenerCosa() {
        return Optional.of(new Cosa("Pedro Sanchez"));
    }

    private static void hazAlgoMasConEstaCosa(Cosa cosa) {

        if (cosa != null && cosa.getAlgo() != null) {
            return;
        }

        String algoDeCosa = cosa.getAlgo();
        algoDeCosa = algoDeCosa.concat(" Haciendo cosas...");
        cosa.setAlgo(algoDeCosa);
    }


    public static void hazAlgoConEstaCosa(Cosa cosa) {
        String algoDeCosa = cosa.getAlgo();
        algoDeCosa = algoDeCosa.concat(" Haciendo cosas...");
        cosa.setAlgo(algoDeCosa);
    }
}