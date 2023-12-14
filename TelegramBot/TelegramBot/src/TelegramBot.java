import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class TelegramBot extends TelegramLongPollingBot {



    public String getBotUsername() {
        return "MindrocBot";
    }

    @Override
    public String getBotToken() {
        return "6528163479:AAGsm9pCEj0yAs75AnZjIVwmbovuW3C-g34";
    }

    public void onUpdateReceived(Update update) {
        String msg = update.getMessage().getText();
        String chatId = update.getMessage().getChatId().toString();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        // Aggiungi uno switch case per gestire richieste di generi di film
        switch (msg.toLowerCase()) {
            case "/start": sendMessage.setText("Benvenuto!\n\nEcco alcuni comandi disponibili:\n" +
                        "/start - Inizia la conversazione\n" +
                        "/azione - genera film di azione\n" +
                        "/commedia - genera film di commedia\n" +
                    "/romantico - genera film romantico\n" +
                    "/animazione - genera film di animazione\n" +
                    "/dramma - genera film drammatico\n" +
                    "/anime - genera titoli anime\n" +
                    "/horror - genera film horror\n");

                break;
            case "/azione":
                sendRandomMovies(chatId, "azione");
                break;
            case "/commedia":
                sendRandomMovies(chatId, "commedia");
                break;
            case "/horror":
                sendRandomMovies(chatId, "horror");
                break;
            case "/dramma":
                sendRandomMovies(chatId, "dramma");
                break;
            case "/animazione":
                sendRandomMovies(chatId, "animazione");
                break;
            case "/romantico":
                sendRandomMovies(chatId, "romantico");
                break;
            case "/anime":
                sendRandomMovies(chatId, "anime");
                break;

            default:
                sendMessage.setText("Comando sbagliato. Riprova");
        }

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void sendRandomMovies(String chatId, String genre) {
        List<Movie> movies = getMoviesByGenre(genre);
        if (!movies.isEmpty()) {
            Random random = new Random();
            List<Movie> randomMovies = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                int randomIndex = random.nextInt(movies.size());
                randomMovies.add(movies.get(randomIndex));
                movies.remove(randomIndex);
            }

            StringBuilder messageText = new StringBuilder("Ecco 3 film del genere:   " + genre + "\n");

            for (Movie movie : randomMovies) {
                messageText.append(" •  ").append(movie.getTitle()).append("\n");
            }

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText(messageText.toString());

            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        } else {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("Mi dispiace, non ho film disponibili per il genere: " + genre);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    private List<Movie> getMoviesByGenre(String genre) {

        List<Movie> movies = new ArrayList<>();movies.add(new Movie("FAST & FURIOUS 7 (2015)", "azione"));
        movies.add(new Movie("IO SONO LEGGENDA (2007)", "azione"));
        movies.add(new Movie("IL CAVALIERE OSCURO (2008)", "azione"));
        movies.add(new Movie("INCEPTION (2010)", "azione"));
        movies.add(new Movie("JOKER (2019)", "azione"));
        movies.add(new Movie("BASTARDI SENZA GLORIA (2009)", "azione"));
        movies.add(new Movie("THE PRESTIGE (2006)", "azione"));
        movies.add(new Movie("AMERICAN SNIPER (2015)", "azione"));
        movies.add(new Movie("JOHN RAMBO (2008)", "azione"));
        movies.add(new Movie("CENA CON DELITTO - KNIVES OUT (2019)", "azione"));
        movies.add(new Movie("AVENGERS: ENDGAME (2019)", "azione"));
        movies.add(new Movie("AVENGERS: INFINITY WAR (2018)", "azione"));
        movies.add(new Movie("READY PLAYER ONE (2018)", "azione"));
        movies.add(new Movie("GRAN TORINO (2008)", "azione"));
        movies.add(new Movie("ROBIN HOOD (2010)", "azione"));
        movies.add(new Movie("I MERCENARI - THE EXPENDABLES (2010)", "azione"));
        movies.add(new Movie("CASINO ROYALE (2006)", "azione"));
        movies.add(new Movie("PIRATI DEI CARAIBI - OLTRE I CONFINI DEL MARE (2011)", "azione"));
        movies.add(new Movie("KING KONG (2005)", "azione"));
        movies.add(new Movie("THE AVENGERS (2012)", "azione"));
        movies.add(new Movie("TOP GUN - MAVERICK (2022)", "azione"));
        movies.add(new Movie("BLACK PANTHER (2018)", "azione"));
        movies.add(new Movie("MISSION: IMPOSSIBLE - FALLOUT (2018)", "azione"));
        movies.add(new Movie("NELLA TANA DEI LUPI (2018)", "azione"));
        movies.add(new Movie("SNOWPIERCER (2013)", "azione"));
        movies.add(new Movie("QUANTUM OF SOLACE (2008)", "azione"));
        movies.add(new Movie("L'ULTIMA MISSIONE (2008)", "azione"));
        movies.add(new Movie("LO CHIAMAVANO JEEG ROBOT (2015)", "azione"));
        movies.add(new Movie("IL CAVALIERE OSCURO - IL RITORNO (2012)", "azione"));
        movies.add(new Movie("DUNKIRK (2017)", "azione"));
        movies.add(new Movie("CAPTAIN MARVEL (2019)", "azione"));
        movies.add(new Movie("SOLDADO (2018)", "azione"));
        movies.add(new Movie("THE AMAZING SPIDER-MAN (2012)", "azione"));
        movies.add(new Movie("THE BATMAN (2022)", "azione"));
        movies.add(new Movie("LE MANS '66 - LA GRANDE SFIDA (2019)", "azione"));
        movies.add(new Movie("COLLATERAL (2004)", "azione"));
        movies.add(new Movie("SPIDER-MAN: FAR FROM HOME (2019)", "azione"));
        movies.add(new Movie("NO TIME TO DIE (2021)", "azione"));
        movies.add(new Movie("SPIDER-MAN - NO WAY HOME (2021)", "azione"));
        movies.add(new Movie("DEATH RACE (2008)", "azione"));
        movies.add(new Movie("DEADPOOL 2 (2018)", "azione"));
        movies.add(new Movie("UN UOMO TRANQUILLO (2019)", "azione"));
        movies.add(new Movie("OBLIVION (2013)", "azione"));
        movies.add(new Movie("SUICIDE SQUAD (2016)", "azione"));
        movies.add(new Movie("IRON MAN 3 (2013)", "azione"));
        movies.add(new Movie("JOHN WICK 3 - PARABELLUM (2019)", "azione"));
        movies.add(new Movie("JURASSIC WORLD (2015)", "azione"));
        movies.add(new Movie("IL COLLEZIONISTA DI CARTE (2021)", "azione"));
        movies.add(new Movie("EDGE OF TOMORROW - SENZA DOMANI (2014)", "azione"));
        movies.add(new Movie("FAST & FURIOUS - HOBBS & SHAW (2019)", "azione"));
        movies.add(new Movie("GUARDIANI DELLA GALASSIA (2014)", "azione"));
        movies.add(new Movie("HEART OF THE SEA - LE ORIGINI DI MOBY DICK (2015)", "azione"));
        movies.add(new Movie("ANT-MAN AND THE WASP (2018)", "azione"));
        movies.add(new Movie("WARRIOR (2011)", "azione"));
        movies.add(new Movie("BABY DRIVER - IL GENIO DELLA FUGA (2017)", "azione"));
        movies.add(new Movie("FURY (2014)", "azione"));
        movies.add(new Movie("LANTERNA VERDE (2011)", "azione"));
        movies.add(new Movie("MAD MAX: FURY ROAD (2015)", "azione"));
        movies.add(new Movie("VELOCE COME IL VENTO (2016)", "azione"));
        movies.add(new Movie("REAL STEEL (2011)", "azione"));
        movies.add(new Movie("FAST & FURIOUS 6 (2013)", "azione"));
        movies.add(new Movie("BLACK WIDOW (2021)", "azione"));
        movies.add(new Movie("X-MEN - GIORNI DI UN FUTURO PASSATO (2014)", "azione"));
        movies.add(new Movie("SKYFALL (2012)", "azione"));
        movies.add(new Movie("GODZILLA (2014)", "azione"));
        movies.add(new Movie("CAPTAIN PHILLIPS - ATTACCO IN MARE APERTO (2013)", "azione"));
        movies.add(new Movie("INDIANA JONES E IL QUADRANTE DEL DESTINO (2023)", "azione"));
        movies.add(new Movie("APES REVOLUTION - IL PIANETA DELLE SCIMMIE (2014)", "azione"));
        movies.add(new Movie("CAPTAIN AMERICA - THE WINTER SOLDIER (2014)", "azione"));
        movies.add(new Movie("6 UNDERGROUND (2019)", "azione"));
        movies.add(new Movie("MISSION IMPOSSIBLE - PROTOCOLLO FANTASMA (2011)", "azione"));
        movies.add(new Movie("JOHN WICK 4 (2023)", "azione"));
        movies.add(new Movie("DOCTOR STRANGE NEL MULTIVERSO DELLA FOLLIA (2022)", "azione"));
        movies.add(new Movie("GHOSTBUSTERS - LEGACY (2021)", "azione"));
        movies.add(new Movie("GET RICH OR DIE TRYIN' (2005)", "azione"));
        movies.add(new Movie("MEN IN BLACK 3 (2012)", "azione"));
        movies.add(new Movie("GODZILLA VS KONG (2021)", "azione"));
        movies.add(new Movie("BABY DRIVER (2017)", "azione"));
        movies.add(new Movie("CREED II (2018)", "azione"));


        movies.add(new Movie("CHE BELLA GIORNATA (2011)", "commedia"));
        movies.add(new Movie("LA BANDA DEI BABBI NATALE (2010)", "commedia"));
        movies.add(new Movie("TRE UOMINI E UNA GAMBA (1997)", "commedia"));
        movies.add(new Movie("FANTOZZI (1975)", "commedia"));
        movies.add(new Movie("COSÌ È LA VITA (1998)", "commedia"));
        movies.add(new Movie("TOLO TOLO (2020)", "commedia"));
        movies.add(new Movie("10 GIORNI SENZA MAMMA (2019)", "commedia"));
        movies.add(new Movie("PERFETTI SCONOSCIUTI (2016)", "commedia"));
        movies.add(new Movie("SMETTO QUANDO VOGLIO (2014)", "commedia"));
        movies.add(new Movie("BENVENUTI AL SUD (2010)", "commedia"));
        movies.add(new Movie("SOLE A CATINELLE (2013)", "commedia"));
        movies.add(new Movie("LA MATASSA (2009)", "commedia"));
        movies.add(new Movie("JOJO RABBIT (2019)", "commedia"));
        movies.add(new Movie("COME UN GATTO IN TANGENZIALE - RITORNO A COCCIA DI MORTO (2021)", "commedia"));
        movies.add(new Movie("LA FABBRICA DI CIOCCOLATO (2015)", "commedia"));
        movies.add(new Movie("IL GRINCH (2000)", "commedia"));
        movies.add(new Movie("UNA NOTTE DA LEONI (2009)", "commedia"));
        movies.add(new Movie("THE WOLF OF WALL STREET (2013)", "commedia"));
        movies.add(new Movie("I 2 SOLITI IDIOTI (2012)", "commedia"));
        movies.add(new Movie("BAYWATCH (2017)", "commedia"));
        movies.add(new Movie("NONNO SCATENATO (2016)", "commedia"));
        movies.add(new Movie("POVERI MA RICCHISSIMI (2017)", "commedia"));
        movies.add(new Movie("QUO VADO? (2016)", "commedia"));
        movies.add(new Movie("UNA SPIA E MEZZO (2016)", "commedia"));
        movies.add(new Movie("2 AGENTI MOLTO SPECIALI 2 (2022)", "commedia"));
        movies.add(new Movie("JOHNNY ENGLISH COLPISCE ANCORA (2018)", "commedia"));
        movies.add(new Movie("JOHNNY ENGLISH LA RINASCITA (2011)", "commedia"));
        movies.add(new Movie("NATI CON LA CAMICIA (1983)", "commedia"));
        movies.add(new Movie("SE DIO VUOLE (2015)", "commedia"));
        movies.add(new Movie("IL RICCO, IL POVERO E IL MAGGIORDOMO (2014)", "commedia"));
        movies.add(new Movie("SOTTO IL SOLE DI RICCIONE (2020)", "commedia"));
        movies.add(new Movie("NOI E LA GIULIA (2014)", "commedia"));
        movies.add(new Movie("THE TRUMAN SHOW (1998)", "commedia"));
        movies.add(new Movie("CHE BELLA GIORNATA (2011)", "commedia"));
        movies.add(new Movie("CADO DALLE NUBI (2009)", "commedia"));
        movies.add(new Movie("TED (2012)", "commedia"));
        movies.add(new Movie("COME UN GATTO IN TANGENZIALE (2017)", "commedia"));
        movies.add(new Movie("SCUSATE SE ESISTO! (2014)", "commedia"));
        movies.add(new Movie("LO SBIRRO DI BELLEVILLE (2018)", "commedia"));
        movies.add(new Movie("MASCHI CONTRO FEMMINE (2010)", "commedia"));

        movies.add(new Movie("Psycho (1960)", "horror"));
        movies.add(new Movie("The Exorcist (1973)", "horror"));
        movies.add(new Movie("Halloween (1978)", "horror"));
        movies.add(new Movie("The Shining (1980)", "horror"));
        movies.add(new Movie("A Nightmare on Elm Street (1984)", "horror"));
        movies.add(new Movie("The Texas Chain Saw Massacre (1974)", "horror"));
        movies.add(new Movie("Jaws (1975)", "horror"));
        movies.add(new Movie("Rosemary's Baby (1968)", "horror"));
        movies.add(new Movie("Alien (1979)", "horror"));
        movies.add(new Movie("The Silence of the Lambs (1991)", "horror"));
        movies.add(new Movie("The Conjuring (2013)", "horror"));
        movies.add(new Movie("Get Out (2017)", "horror"));
        movies.add(new Movie("The Babadook (2014)", "horror"));
        movies.add(new Movie("It (2017)", "horror"));
        movies.add(new Movie("The Ring (2002)", "horror"));
        movies.add(new Movie("Hereditary (2018)", "horror"));
        movies.add(new Movie("Psycho (1960)", "horror"));
        movies.add(new Movie("Poltergeist (1982)", "horror"));
        movies.add(new Movie("The Sixth Sense (1999)", "horror"));
        movies.add(new Movie("The Blair Witch Project (1999)", "horror"));
        movies.add(new Movie("Don't Look Now (1973)", "horror"));
        movies.add(new Movie("Suspiria (1977)", "horror"));
        movies.add(new Movie("The Omen (1976)", "horror"));
        movies.add(new Movie("The Cabin in the Woods (2012)", "horror"));
        movies.add(new Movie("A Quiet Place (2018)", "horror"));
        movies.add(new Movie("Scream (1996)", "horror"));
        movies.add(new Movie("The Witch (2015)", "horror"));
        movies.add(new Movie("The Others (2001)", "horror"));
        movies.add(new Movie("Carrie (1976)", "horror"));
        movies.add(new Movie("28 Days Later (2002)", "horror"));
        movies.add(new Movie("Paranormal Activity (2007)", "horror"));
        movies.add(new Movie("The Descent (2005)", "horror"));
        movies.add(new Movie("Dawn of the Dead (1978)", "horror"));
        movies.add(new Movie("The Fly (1986)", "horror"));
        movies.add(new Movie("The Birds (1963)", "horror"));
        movies.add(new Movie("Let the Right One In (2008)", "horror"));
        movies.add(new Movie("The Orphanage (2007)", "horror"));
        movies.add(new Movie("The Babadook (2014)", "horror"));
        movies.add(new Movie("The Wicker Man (1973)", "horror"));
        movies.add(new Movie("The Thing (1982)", "horror"));
        movies.add(new Movie("Insidious (2010)", "horror"));
        movies.add(new Movie("A Tale of Two Sisters (2003)", "horror"));
        movies.add(new Movie("The Grudge (2004)", "horror"));
        movies.add(new Movie("The Mist (2007)", "horror"));
        movies.add(new Movie("The Cabin in the Woods (2012)", "horror"));
        movies.add(new Movie("Oculus (2013)", "horror"));
        movies.add(new Movie("The Nun (2018)", "horror"));
        movies.add(new Movie("The Others (2001)", "horror"));
        movies.add(new Movie("Drag Me to Hell (2009)", "horror"));
        movies.add(new Movie("The Sixth Sense (1999)", "horror"));
        movies.add(new Movie("Via col vento (Casablanca) (1942)", "romantico"));
        movies.add(new Movie("Notting Hill (1999)", "romantico"));
        movies.add(new Movie("Titanic (1997)", "romantico"));
        movies.add(new Movie("La La Land (2016)", "romantico"));
        movies.add(new Movie("Il diario di Bridget Jones (Bridget Jones's Diary) (2001)", "romantico"));
        movies.add(new Movie("Orgoglio e pregiudizio (Pride and Prejudice) (2005)", "romantico"));
        movies.add(new Movie("Colazione da Tiffany (Breakfast at Tiffany's) (1961)", "romantico"));
        movies.add(new Movie("C'era una volta in America (Once Upon a Time in America) (1984)", "romantico"));
        movies.add(new Movie("Il grande Gatsby (The Great Gatsby) (2013)", "romantico"));
        movies.add(new Movie("L'età dell'innocenza (The Age of Innocence) (1993)", "romantico"));
        movies.add(new Movie("Romeo + Giulietta (Romeo + Juliet) (1996)", "romantico"));
        movies.add(new Movie("Love Story (1970)", "romantico"));
        movies.add(new Movie("Prima dell'alba (Before Sunrise) (1995)", "romantico"));
        movies.add(new Movie("Prima del tramonto (Before Sunset) (2004)", "romantico"));
        movies.add(new Movie("500 giorni insieme (500 Days of Summer) (2009)", "romantico"));
        movies.add(new Movie("Dirty Dancing (1987)", "romantico"));
        movies.add(new Movie("L'ultimo bacio (2001)", "romantico"));
        movies.add(new Movie("Il favoloso mondo di Amélie (Amélie) (2001)", "romantico"));
        movies.add(new Movie("Il ponte sul fiume Kwai (The Bridge on the River Kwai) (1957)", "romantico"));
        movies.add(new Movie("Cime tempestose (Wuthering Heights) (1939)", "romantico"));
        movies.add(new Movie("Il paziente inglese (The English Patient) (1996)", "romantico"));
        movies.add(new Movie("Ghost - Fantasma (1990)", "romantico"));
        movies.add(new Movie("Shakespeare in Love (1998)", "romantico"));
        movies.add(new Movie("La forma dell'acqua - The Shape of Water (2017)", "romantico"));
        movies.add(new Movie("Il lato positivo - Silver Linings Playbook (Silver Linings Playbook) (2012)", "romantico"));
        movies.add(new Movie("La ragazza della porta accanto (The Girl Next Door) (2004)", "romantico"));
        movies.add(new Movie("Il diavolo veste Prada (The Devil Wears Prada) (2006)", "romantico"));
        movies.add(new Movie("Moulin Rouge! (2001)", "romantico"));
        movies.add(new Movie("Ragione e sentimento (Sense and Sensibility) (1995)", "romantico"));
        movies.add(new Movie("Il matrimonio di mia sorella (My Big Fat Greek Wedding) (2002)", "romantico"));
        movies.add(new Movie("Educazione siberiana (Siberian Education) (2013)", "romantico"));
        movies.add(new Movie("La Famiglia Savage (The Savages) (2007)", "romantico"));
        movies.add(new Movie("Com'è dura l'avventura (Adventureland) (2009)", "romantico"));
        movies.add(new Movie("La grande bellezza (2013)", "romantico"));
        movies.add(new Movie("La dolce vita (1960)", "romantico"));
        movies.add(new Movie("Up (2009)", "romantico"));
        movies.add(new Movie("Wall-E (2008)", "romantico"));
        movies.add(new Movie("Eternal Sunshine of the Spotless Mind (2004)", "romantico"));
        movies.add(new Movie("Il favoloso mondo di Amélie (Amélie) (2001)", "romantico"));
        movies.add(new Movie("I Tenenbaum (The Royal Tenenbaums) (2001)", "romantico"));
        movies.add(new Movie("Lost in Translation - L'amore tradotto (Lost in Translation) (2003)", "romantico"));
        movies.add(new Movie("E se vivessimo tutti insieme? (2011)", "romantico"));
        movies.add(new Movie("Blue Valentine (2010)", "romantico"));
        movies.add(new Movie("500 giorni insieme (500 Days of Summer) (2009)", "romantico"));
        movies.add(new Movie("Il padrino (The Godfather) (1972)", "dramma"));
        movies.add(new Movie("Schindler's List (1993)", "dramma"));
        movies.add(new Movie("Forrest Gump (1994)", "dramma"));
        movies.add(new Movie("C'era una volta in America (Once Upon a Time in America) (1984)", "dramma"));
        movies.add(new Movie("Il miglio verde (The Green Mile) (1999)", "dramma"));
        movies.add(new Movie("Il cavaliere oscuro (The Dark Knight) (2008)", "dramma"));
        movies.add(new Movie("Il sesto senso (The Sixth Sense) (1999)", "dramma"));
        movies.add(new Movie("La vita è bella (1997)", "dramma"));
        movies.add(new Movie("Il gladiatore (Gladiator) (2000)", "dramma"));
        movies.add(new Movie("Shawshank Redemption - Le ali della libertà (The Shawshank Redemption) (1994)", "dramma"));
        movies.add(new Movie("Il discorso del re (The King's Speech) (2010)", "dramma"));
        movies.add(new Movie("American Beauty (1999)", "dramma"));
        movies.add(new Movie("Rain Man (1988)", "dramma"));
        movies.add(new Movie("Il buio oltre la siepe (To Kill a Mockingbird) (1962)", "dramma"));
        movies.add(new Movie("I soliti sospetti (The Usual Suspects) (1995)", "dramma"));
        movies.add(new Movie("L'attimo fuggente (Dead Poets Society) (1989)", "dramma"));
        movies.add(new Movie("La ragazza con l'orecchino di perla (Girl with a Pearl Earring) (2003)", "dramma"));
        movies.add(new Movie("Il grande Gatsby (The Great Gatsby) (2013)", "dramma"));
        movies.add(new Movie("Una mente pericolosa (A Beautiful Mind) (2001)", "dramma"));
        movies.add(new Movie("Spotlight (2015)", "dramma"));
        movies.add(new Movie("La La Land (2016)", "dramma"));
        movies.add(new Movie("Whiplash (2014)", "dramma"));
        movies.add(new Movie("Il paziente inglese (The English Patient) (1996)", "dramma"));
        movies.add(new Movie("Il favoloso mondo di Amélie (Amélie) (2001)", "dramma"));
        movies.add(new Movie("Il diavolo veste Prada (The Devil Wears Prada) (2006)", "dramma"));
        movies.add(new Movie("Il lato positivo - Silver Linings Playbook (Silver Linings Playbook) (2012)", "dramma"));
        movies.add(new Movie("Lost in Translation - L'amore tradotto (Lost in Translation) (2003)", "dramma"));
        movies.add(new Movie("Blue Valentine (2010)", "dramma"));
        movies.add(new Movie("500 giorni insieme (500 Days of Summer) (2009)", "dramma"));
        movies.add(new Movie("Manchester by the Sea (2016)", "dramma"));
        movies.add(new Movie("La forma dell'acqua - The Shape of Water (2017)", "dramma"));
        movies.add(new Movie("La migliore offerta (2013)", "dramma"));
        movies.add(new Movie("Birdman (2014)", "dramma"));
        movies.add(new Movie("Moonlight (2016)", "dramma"));
        movies.add(new Movie("Il Re Leone (The Lion King) (1994)", "animazione"));
        movies.add(new Movie("Toy Story (1995)", "animazione"));
        movies.add(new Movie("La Sirenetta (The Little Mermaid) (1989)", "animazione"));
        movies.add(new Movie("Shrek (2001)", "animazione"));
        movies.add(new Movie("Cenerentola (Cinderella) (1950)", "animazione"));
        movies.add(new Movie("Frozen - Il regno di ghiaccio (Frozen) (2013)", "animazione"));
        movies.add(new Movie("La Bella e la Bestia (Beauty and the Beast) (1991)", "animazione"));
        movies.add(new Movie("Aladdin (1992)", "animazione"));
        movies.add(new Movie("Toy Story 3 (2010)", "animazione"));
        movies.add(new Movie("Up (2009)", "animazione"));
        movies.add(new Movie("Il Gatto con gli stivali (Puss in Boots) (2011)", "animazione"));
        movies.add(new Movie("Zootropolis (Zootopia) (2016)", "animazione"));
        movies.add(new Movie("Shrek 2 (2004)", "animazione"));
        movies.add(new Movie("Inside Out (2015)", "animazione"));
        movies.add(new Movie("La Principessa e il Ranocchio (The Princess and the Frog) (2009)", "animazione"));
        movies.add(new Movie("Ratatouille (2007)", "animazione"));
        movies.add(new Movie("Wall-E (2008)", "animazione"));
        movies.add(new Movie("Il Viaggio di Arlo (The Good Dinosaur) (2015)", "animazione"));
        movies.add(new Movie("Toy Story 2 (1999)", "animazione"));
        movies.add(new Movie("Kung Fu Panda (2008)", "animazione"));
        movies.add(new Movie("Big Hero 6 (2014)", "animazione"));
        movies.add(new Movie("Monsters, Inc. (2001)", "animazione"));
        movies.add(new Movie("I Croods (The Croods) (2013)", "animazione"));
        movies.add(new Movie("Shrek Terzo (Shrek the Third) (2007)", "animazione"));
        movies.add(new Movie("Il Libro della Giungla (The Jungle Book) (1967)", "animazione"));
        movies.add(new Movie("Ralph Spaccatutto (Wreck-It Ralph) (2012)", "animazione"));
        movies.add(new Movie("Madagascar (2005)", "animazione"));
        movies.add(new Movie("I Minions (Minions) (2015)", "animazione"));
        movies.add(new Movie("Coco (2017)", "animazione"));
        movies.add(new Movie("L'era glaciale (Ice Age) (2002)", "animazione"));
        movies.add(new Movie("La Città Incantata (Spirited Away) (2001)", "animazione"));
        movies.add(new Movie("Il Gobbo di Notre Dame (The Hunchback of Notre Dame) (1996)", "animazione"));
        movies.add(new Movie("Kung Fu Panda 2 (2011)", "animazione"));
        movies.add(new Movie("I Simpson - Il Film (The Simpsons Movie) (2007)", "animazione"));
        movies.add(new Movie("Tarzan (1999)", "animazione"));
        movies.add(new Movie("I Pirati! Bande di Misfits (The Pirates! In an Adventure with Scientists!) (2012)", "animazione"));
        movies.add(new Movie("L'era glaciale 2 - Il disgelo (Ice Age: The Meltdown) (2006)", "animazione"));
        movies.add(new Movie("Ratatouille (2007)", "animazione"));
        movies.add(new Movie("Coraline e la Porta Magica (Coraline) (2009)", "animazione"));
        movies.add(new Movie("La sposa cadavere (Corpse Bride) (2005)", "animazione"));
        movies.add(new Movie("Il Libro della Vita (The Book of Life) (2014)", "animazione"));
        movies.add(new Movie("Shrek e vissero felici e contenti (Shrek Forever After) (2010)", "animazione"));
        movies.add(new Movie("La principessa Mononoke (Princess Mononoke) (1997)", "animazione"));
        movies.add(new Movie("Il Gigante di Ferro (The Iron Giant) (1999)", "animazione"));
        movies.add(new Movie("Bolt - Un eroe a quattro zampe (Bolt) (2008)", "animazione"));
        movies.add(new Movie("Fantasia (1940)", "animazione"));
        movies.add(new Movie("Le Avventure di Tintin - Il segreto dell'Unicorno (The Adventures of Tintin) (2011)", "animazione"));
        movies.add(new Movie("Il Viaggio di Chihiro (Spirited Away) (2001)", "animazione"));
        movies.add(new Movie("Il Libro della Vita (The Book of Life) (2014)", "animazione"));
        movies.add(new Movie("Naruto (2002-2007)", "anime"));
        movies.add(new Movie("Dragon Ball Z (1989-1996)", "anime"));
        movies.add(new Movie("One Piece (1999 - in corso)", "anime"));
        movies.add(new Movie("Attack on Titan (Shingeki no Kyojin) (2013-2021)", "anime"));
        movies.add(new Movie("Fullmetal Alchemist: Brotherhood (2009-2010)", "anime"));
        movies.add(new Movie("Death Note (2006-2007)", "anime"));
        movies.add(new Movie("Sword Art Online (2012- in corso)", "anime"));
        movies.add(new Movie("My Hero Academia (Boku no Hero Academia) (2016- in corso)", "anime"));
        movies.add(new Movie("Tokyo Ghoul (2014-2015)", "anime"));
        movies.add(new Movie("Hunter x Hunter (2011-2014)", "anime"));
        movies.add(new Movie("One Punch Man (2015- in corso)", "anime"));
        movies.add(new Movie("Demon Slayer (Kimetsu no Yaiba) (2019-2020)", "anime"));
        movies.add(new Movie("Steins;Gate (2011)", "anime"));
        movies.add(new Movie("Neon Genesis Evangelion (1995-1996)", "anime"));
        movies.add(new Movie("Cowboy Bebop (1998)", "anime"));
        movies.add(new Movie("One Punch Man (2015- in corso)", "anime"));
        movies.add(new Movie("Code Geass: Lelouch of the Rebellion (2006-2007)", "anime"));
        movies.add(new Movie("Clannad: After Story (2008-2009)", "anime"));
        movies.add(new Movie("Fairy Tail (2009-2019)", "anime"));
        movies.add(new Movie("Your Lie in April (Shigatsu wa Kimi no Uso) (2014-2015)", "anime"));
        movies.add(new Movie("Bleach (2004-2012)", "anime"));
        movies.add(new Movie("Nausicaä della Valle del vento (1984)", "anime"));
        movies.add(new Movie("Dragon Ball (1986-1989)", "anime"));
        movies.add(new Movie("Hunter x Hunter (2011-2014)", "anime"));
        movies.add(new Movie("Death Parade (2015)", "anime"));
        movies.add(new Movie("Parasyte -the maxim- (Kiseijuu: Sei no Kakuritsu) (2014-2015)", "anime"));
        movies.add(new Movie("JoJo's Bizarre Adventure (2012- in corso)", "anime"));
        movies.add(new Movie("Mob Psycho 100 (2016-2019)", "anime"));
        movies.add(new Movie("Psycho-Pass (2012-2013)", "anime"));
        movies.add(new Movie("Black Clover (2017- in corso)", "anime"));
        movies.add(new Movie("Assassination Classroom (Ansatsu Kyoushitsu) (2015-2016)", "anime"));
        movies.add(new Movie("The Promised Neverland (Yakusoku no Neverland) (2019-2021)", "anime"));
        movies.add(new Movie("Noragami (2014-2015)", "anime"));
        movies.add(new Movie("Spirited Away (Sen to Chihiro no Kamikakushi) (2001)", "anime"));
        movies.add(new Movie("Ghost in the Shell: Stand Alone Complex (2002-2005)", "anime"));
        movies.add(new Movie("Baccano! (2007)", "anime"));
        movies.add(new Movie("Death Parade (2015)", "anime"));
        movies.add(new Movie("Gurren Lagann (Tengen Toppa Gurren Lagann) (2007)", "anime"));
        movies.add(new Movie("Black Lagoon (2006-2007)", "anime"));
        movies.add(new Movie("Haikyuu!! (2014-2020)", "anime"));
        movies.add(new Movie("Akira (1988)", "anime"));
        movies.add(new Movie("Cowboy Bebop (1998)", "anime"));
        movies.add(new Movie("Great Teacher Onizuka (GTO) (1999-2000)", "anime"));
        movies.add(new Movie("K-On! (2009-2010)", "anime"));
        movies.add(new Movie("Serial Experiments Lain (1998)", "anime"));
        movies.add(new Movie("No Game No Life (2014)", "anime"));
        movies.add(new Movie("Made in Abyss (2017)", "anime"));
        movies.add(new Movie("Re:Zero - Starting Life in Another World (2016- in corso)", "anime"));
        movies.add(new Movie("Durarara!! (2010-2011)", "anime"));
        movies.add(new Movie("Gintama (2006-2018)", "anime"));






        List<Movie> filteredMovies = movies.stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());

        return filteredMovies;
    }

    private static class Movie {
        private final String title;
        private final String genre;

        public Movie(String title, String genre) {
            this.title = title;
            this.genre = genre;
        }

        public String getTitle() {
            return title;
        }

        public String getGenre() {
            return genre;
        }
    }
}
