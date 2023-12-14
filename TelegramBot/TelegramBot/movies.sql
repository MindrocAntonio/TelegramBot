-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Creato il: Dic 14, 2023 alle 01:56
-- Versione del server: 10.4.28-MariaDB
-- Versione PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `movies`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `movies`
--

CREATE TABLE `movies` (
  `titolo` text NOT NULL,
  `genere` text NOT NULL,
  `anno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `movies`
--

INSERT INTO `movies` (`titolo`, `genere`, `anno`) VALUES
('IO SONO LEGGENDA', 'azione', 2007),
('IL CAVALIERE OSCURO', 'azione', 2008),
('INCEPTION', 'azione', 2010),
('JOKER', 'azione', 2019),
('BASTARDI SENZA GLORIA', 'azione', 2009),
('THE PRESTIGE', 'azione', 2006),
('AMERICAN SNIPER', 'azione', 2015),
('JOHN RAMBO', 'azione', 2008),
('CENA CON DELITTO - KNIVES OUT', 'azione', 2019),
('AVENGERS: ENDGAME', 'azione', 2019),
('AVENGERS: INFINITY WAR', 'azione', 2018),
('READY PLAYER ONE', 'azione', 2018),
('GRAN TORINO', 'azione', 2008),
('ROBIN HOOD', 'azione', 2010),
('I MERCENARI - THE EXPENDABLES', 'azione', 2010),
('CASINO ROYALE', 'azione', 2006),
('PIRATI DEI CARAIBI - OLTRE I CONFINI DEL MARE', 'azione', 2011),
('KING KONG', 'azione', 2005),
('THE AVENGERS', 'azione', 2012),
('TOP GUN - MAVERICK', 'azione', 2022),
('BLACK PANTHER', 'azione', 2018),
('MISSION: IMPOSSIBLE - FALLOUT', 'azione', 2018),
('NELLA TANA DEI LUPI', 'azione', 2018),
('SNOWPIERCER', 'azione', 2013),
('QUANTUM OF SOLACE', 'azione', 2008),
('L\'ULTIMA MISSIONE', 'azione', 2008),
('LO CHIAMAVANO JEEG ROBOT', 'azione', 2015),
('IL CAVALIERE OSCURO - IL RITORNO', 'azione', 2012),
('DUNKIRK', 'azione', 2017),
('CAPTAIN MARVEL', 'azione', 2019),
('SOLDADO', 'azione', 2018),
('THE AMAZING SPIDER-MAN', 'azione', 2012),
('THE BATMAN', 'azione', 2022),
('LE MANS \'66 - LA GRANDE SFIDA', 'azione', 2019),
('COLLATERAL', 'azione', 2004),
('SPIDER-MAN: FAR FROM HOME', 'azione', 2019),
('NO TIME TO DIE', 'azione', 2021),
('SPIDER-MAN - NO WAY HOME', 'azione', 2021),
('DEATH RACE', 'azione', 2008),
('DEADPOOL 2', 'azione', 2018),
('UN UOMO TRANQUILLO', 'azione', 2019),
('OBLIVION', 'azione', 2013),
('SUICIDE SQUAD', 'azione', 2016),
('IRON MAN 3', 'azione', 2013),
('JOHN WICK 3 - PARABELLUM', 'azione', 2019),
('JURASSIC WORLD', 'azione', 2015),
('IL COLLEZIONISTA DI CARTE', 'azione', 2021),
('EDGE OF TOMORROW - SENZA DOMANI', 'azione', 2014),
('FAST & FURIOUS - HOBBS & SHAW', 'azione', 2019),
('GUARDIANI DELLA GALASSIA', 'azione', 2014),
('HEART OF THE SEA - LE ORIGINI DI MOBY DICK', 'azione', 2015),
('ANT-MAN AND THE WASP', 'azione', 2018),
('WARRIOR', 'azione', 2011),
('BABY DRIVER - IL GENIO DELLA FUGA', 'azione', 2017),
('FURY', 'azione', 2014),
('LANTERNA VERDE', 'azione', 2011),
('MAD MAX: FURY ROAD', 'azione', 2015),
('VELOCE COME IL VENTO', 'azione', 2016),
('REAL STEEL', 'azione', 2011),
('FAST & FURIOUS 6', 'azione', 2013),
('BLACK WIDOW', 'azione', 2021),
('X-MEN - GIORNI DI UN FUTURO PASSATO', 'azione', 2014),
('SKYFALL', 'azione', 2012),
('GODZILLA', 'azione', 2014),
('CAPTAIN PHILLIPS - ATTACCO IN MARE APERTO', 'azione', 2013),
('INDIANA JONES E IL QUADRANTE DEL DESTINO', 'azione', 2023),
('APES REVOLUTION - IL PIANETA DELLE SCIMMIE', 'azione', 2014),
('CAPTAIN AMERICA - THE WINTER SOLDIER', 'azione', 2014),
('6 UNDERGROUND', 'azione', 2019),
('MISSION IMPOSSIBLE - PROTOCOLLO FANTASMA', 'azione', 2011),
('JOHN WICK 4', 'azione', 2023),
('DOCTOR STRANGE NEL MULTIVERSO DELLA FOLLIA', 'azione', 2022),
('GHOSTBUSTERS - LEGACY', 'azione', 2021),
('GET RICH OR DIE TRYIN\'', 'azione', 2005),
('MEN IN BLACK 3', 'azione', 2012),
('GODZILLA VS KONG', 'azione', 2021),
('BABY DRIVER', 'azione', 2017),
('CREED II', 'azione', 2018),
('CHE BELLA GIORNATA', 'commedia', 2011),
('LA BANDA DEI BABBI NATALE', 'commedia', 2010),
('TRE UOMINI E UNA GAMBA', 'commedia', 1997),
('FANTOZZI', 'commedia', 1975),
('COSÌ È LA VITA', 'commedia', 1998),
('TOLO TOLO', 'commedia', 2020),
('10 GIORNI SENZA MAMMA', 'commedia', 2019),
('PERFETTI SCONOSCIUTI', 'commedia', 2016),
('SMETTO QUANDO VOGLIO', 'commedia', 2014),
('BENVENUTI AL SUD', 'commedia', 2010),
('SOLE A CATINELLE', 'commedia', 2013),
('LA MATASSA', 'commedia', 2009),
('JOJO RABBIT', 'commedia', 2019),
('COME UN GATTO IN TANGENZIALE - RITORNO A COCCIA DI MORTO', 'commedia', 2021),
('LA FABBRICA DI CIOCCOLATO', 'commedia', 2015),
('IL GRINCH', 'commedia', 2000),
('UNA NOTTE DA LEONI', 'commedia', 2009),
('THE WOLF OF WALL STREET', 'commedia', 2013),
('I 2 SOLITI IDIOTI', 'commedia', 2012),
('BAYWATCH', 'commedia', 2017),
('NONNO SCATENATO', 'commedia', 2016),
('POVERI MA RICCHISSIMI', 'commedia', 2017),
('QUO VADO?', 'commedia', 2016),
('UNA SPIA E MEZZO', 'commedia', 2016),
('2 AGENTI MOLTO SPECIALI 2', 'commedia', 2022),
('JOHNNY ENGLISH COLPISCE ANCORA', 'commedia', 2018),
('JOHNNY ENGLISH LA RINASCITA', 'commedia', 2011),
('NATI CON LA CAMICIA', 'commedia', 1983),
('SE DIO VUOLE', 'commedia', 2015),
('IL RICCO, IL POVERO E IL MAGGIORDOMO', 'commedia', 2014),
('SOTTO IL SOLE DI RICCIONE', 'commedia', 2020),
('NOI E LA GIULIA', 'commedia', 2014),
('THE TRUMAN SHOW', 'commedia', 1998),
('CHE BELLA GIORNATA', 'commedia', 2011),
('CADO DALLE NUBI', 'commedia', 2009),
('TED', 'commedia', 2012),
('COME UN GATTO IN TANGENZIALE', 'commedia', 2017),
('SCUSATE SE ESISTO!', 'commedia', 2014),
('LO SBIRRO DI BELLEVILLE', 'commedia', 2018),
('MASCHI CONTRO FEMMINE', 'commedia', 2010),
('Psycho', 'horror', 1960),
('The Exorcist', 'horror', 1973),
('Halloween', 'horror', 1978),
('The Shining', 'horror', 1980),
('A Nightmare on Elm Street', 'horror', 1984),
('The Texas Chain Saw Massacre', 'horror', 1974),
('Jaws', 'horror', 1975),
('Rosemary s Baby', 'horror', 1968),
('Alien', 'horror', 1979),
('The Silence of the Lambs', 'horror', 1991),
('The Conjuring', 'horror', 2013),
('Get Out', 'horror', 2017),
('The Babadook', 'horror', 2014),
('It', 'horror', 2017),
('The Ring', 'horror', 2002),
('Hereditary', 'horror', 2018),
('Psycho', 'horror', 1960),
('Poltergeist', 'horror', 1982),
('The Sixth Sense', 'horror', 1999),
('The Blair Witch Project', 'horror', 1999),
('Dont Look Now', 'horror', 1973),
('Suspiria', 'horror', 1977),
('The Omen', 'horror', 1976),
('The Cabin in the Woods', 'horror', 2012),
('A Quiet Place', 'horror', 2018),
('Scream', 'horror', 1996),
('The Witch', 'horror', 2015),
('The Others', 'horror', 2001),
('Carrie', 'horror', 1976),
('28 Days Later', 'horror', 2002),
('Paranormal Activity', 'horror', 2007),
('The Descent', 'horror', 2005),
('Dawn of the Dead', 'horror', 1978),
('The Fly', 'horror', 1986),
('The Birds', 'horror', 1963),
('Let the Right One In', 'horror', 2008),
('The Orphanage', 'horror', 2007),
('The Babadook', 'horror', 2014),
('The Wicker Man', 'horror', 1973),
('The Thing', 'horror', 1982),
('Insidious', 'horror', 2010),
('A Tale of Two Sisters', 'horror', 2003),
('The Grudge', 'horror', 2004),
('The Mist', 'horror', 2007),
('The Cabin in the Woods', 'horror', 2012),
('Oculus', 'horror', 2013),
('The Nun', 'horror', 2018),
('The Others', 'horror', 2001),
('Drag Me to Hell', 'horror', 2009),
('The Sixth Sense', 'horror', 1999),
('Via col vento (Casablanca)', 'romantico', 1942),
('Notting Hill', 'romantico', 1999),
('Titanic', 'romantico', 1997),
('La La Land', 'romantico', 2016),
('Il diario di Bridget Jones (Bridget Jones\'s Diary)', 'romantico', 2001),
('Orgoglio e pregiudizio (Pride and Prejudice)', 'romantico', 2005),
('Colazione da Tiffany (Breakfast at Tiffany\'s)', 'romantico', 1961),
('C\'era una volta in America (Once Upon a Time in America)', 'romantico', 1984),
('Il grande Gatsby (The Great Gatsby)', 'romantico', 2013),
('L\'età dell\'innocenza (The Age of Innocence)', 'romantico', 1993),
('Romeo + Giulietta (Romeo + Juliet)', 'romantico', 1996),
('Love Story', 'romantico', 1970),
('Prima dell\'alba (Before Sunrise)', 'romantico', 1995),
('Prima del tramonto (Before Sunset)', 'romantico', 2004),
('Prima dell\'alba (Before Midnight)', 'romantico', 2013),
('500 giorni insieme (500 Days of Summer)', 'romantico', 2009),
('Dirty Dancing', 'romantico', 1987),
('L\'ultimo bacio', 'romantico', 2001),
('Il favoloso mondo di Amélie (Amélie)', 'romantico', 2001),
('Il ponte sul fiume Kwai (The Bridge on the River Kwai)', 'romantico', 1957),
('Cime tempestose (Wuthering Heights)', 'romantico', 1939),
('Il paziente inglese (The English Patient)', 'romantico', 1996),
('Ghost - Fantasma', 'romantico', 1990),
('Shakespeare in Love', 'romantico', 1998),
('La forma dell\'acqua - The Shape of Water', 'romantico', 2017),
('Il lato positivo - Silver Linings Playbook (Silver Linings Playbook)', 'romantico', 2012),
('Il lato positivo - Silver Linings Playbook (Silver Linings Playbook)', 'romantico', 2012),
('La ragazza della porta accanto (The Girl Next Door)', 'romantico', 2004),
('Il diavolo veste Prada (The Devil Wears Prada)', 'romantico', 2006),
('Il diario di una tata (Nanny McPhee)', 'romantico', 2005),
('Il fantasma dell\'opera (The Phantom of the Opera)', 'romantico', 2004),
('Lo strano caso di Benjamin Button (The Curious Case of Benjamin Button)', 'romantico', 2008),
('Moulin Rouge!', 'romantico', 2001),
('Ragione e sentimento (Sense and Sensibility)', 'romantico', 1995),
('Il matrimonio di mia sorella (My Big Fat Greek Wedding)', 'romantico', 2002),
('Educazione siberiana (Siberian Education)', 'romantico', 2013),
('La Famiglia Savage (The Savages)', 'romantico', 2007),
('Com\'è dura l\'avventura (Adventureland)', 'romantico', 2009),
('La grande bellezza', 'romantico', 2013),
('La dolce vita', 'romantico', 1960),
('Up', 'romantico', 2009),
('Wall-E', 'romantico', 2008),
('Eternal Sunshine of the Spotless Mind', 'romantico', 2004),
('Il favoloso mondo di Amélie (Amélie)', 'romantico', 2001),
('I Tenenbaum (The Royal Tenenbaums)', 'romantico', 2001),
('Lost in Translation - L\'amore tradotto (Lost in Translation)', 'romantico', 2003),
('E se vivessimo tutti insieme?', 'romantico', 2011),
('Blue Valentine', 'romantico', 2010),
('500 giorni insieme (500 Days of Summer)', 'romantico', 2009),
('Il padrino (The Godfather)', 'dramma', 1972),
('Schindler\'s List', 'dramma', 1993),
('Forrest Gump', 'dramma', 1994),
('C\'era una volta in America (Once Upon a Time in America)', 'dramma', 1984),
('Il miglio verde (The Green Mile)', 'dramma', 1999),
('Il cavaliere oscuro (The Dark Knight)', 'dramma', 2008),
('Il sesto senso (The Sixth Sense)', 'dramma', 1999),
('La vita è bella', 'dramma', 1997),
('Il gladiatore (Gladiator)', 'dramma', 2000),
('Shawshank Redemption - Le ali della libertà (The Shawshank Redemption)', 'dramma', 1994),
('Il discorso del re (The King\'s Speech)', 'dramma', 2010),
('American Beauty', 'dramma', 1999),
('Rain Man', 'dramma', 1988),
('Il buio oltre la siepe (To Kill a Mockingbird)', 'dramma', 1962),
('I soliti sospetti (The Usual Suspects)', 'dramma', 1995),
('L\'attimo fuggente (Dead Poets Society)', 'dramma', 1989),
('La ragazza con lorecchino di perla (Girl with a Pearl Earring)', 'dramma', 2003),
('Il grande Gatsby (The Great Gatsby)', 'dramma', 2013),
('Una mente pericolosa (A Beautiful Mind)', 'dramma', 2001),
('Spotlight', 'dramma', 2015),
('La La Land', 'dramma', 2016),
('Whiplash', 'dramma', 2014),
('Il paziente inglese (The English Patient)', 'dramma', 1996),
('Il favoloso mondo di Amélie (Amélie)', 'dramma', 2001),
('Il diavolo veste Prada (The Devil Wears Prada)', 'dramma', 2006),
('Il lato positivo - Silver Linings Playbook (Silver Linings Playbook)', 'dramma', 2012),
('Lost in Translation - L\'amore tradotto (Lost in Translation)', 'dramma', 2003),
('Blue Valentine', 'dramma', 2010),
('500 giorni insieme (500 Days of Summer)', 'dramma', 2009),
('Manchester by the Sea', 'dramma', 2016),
('La forma dellacqua - The Shape of Water', 'dramma', 2017),
('La migliore offerta', 'dramma', 2013),
('Birdman', 'dramma', 2014),
('Moonlight', 'dramma', 2016),
('Il Re Leone (The Lion King)', 'animazione', 1994),
('Toy Story', 'animazione', 1995),
('La Sirenetta (The Little Mermaid)', 'animazione', 1989),
('Shrek', 'animazione', 2001),
('Cenerentola (Cinderella)', 'animazione', 1950),
('Frozen - Il regno di ghiaccio (Frozen)', 'animazione', 2013),
('La Bella e la Bestia (Beauty and the Beast)', 'animazione', 1991),
('Aladdin', 'animazione', 1992),
('Toy Story 3', 'animazione', 2010),
('Up', 'animazione', 2009),
('Il Gatto con gli stivali (Puss in Boots)', 'animazione', 2011),
('Zootropolis (Zootopia)', 'animazione', 2016),
('Shrek 2', 'animazione', 2004),
('Inside Out', 'animazione', 2015),
('La Principessa e il Ranocchio (The Princess and the Frog)', 'animazione', 2009),
('Ratatouille', 'animazione', 2007),
('Wall-E', 'animazione', 2008),
('Il Viaggio di Arlo (The Good Dinosaur)', 'animazione', 2015),
('Toy Story 2', 'animazione', 1999),
('Kung Fu Panda', 'animazione', 2008),
('Big Hero 6', 'animazione', 2014),
('Monsters, Inc.', 'animazione', 2001),
('I Croods (The Croods)', 'animazione', 2013),
('Shrek Terzo (Shrek the Third)', 'animazione', 2007),
('Il Libro della Giungla (The Jungle Book)', 'animazione', 1967),
('Ralph Spaccatutto (Wreck-It Ralph)', 'animazione', 2012),
('Madagascar', 'animazione', 2005),
('I Minions (Minions)', 'animazione', 2015),
('Coco', 'animazione', 2017),
('L\'era glaciale (Ice Age)', 'animazione', 2002),
('La Città Incantata (Spirited Away)', 'animazione', 2001),
('Il Gobbo di Notre Dame (The Hunchback of Notre Dame)', 'animazione', 1996),
('Kung Fu Panda 2', 'animazione', 2011),
('I Simpson - Il Film (The Simpsons Movie)', 'animazione', 2007),
('Tarzan', 'animazione', 1999),
('I Pirati! Bande di Misfits (The Pirates! In an Adventure with Scientists!)', 'animazione', 2012),
('L\'era glaciale 2 - Il disgelo (Ice Age: The Meltdown)', 'animazione', 2006),
('Ratatouille', 'animazione', 2007),
('Coraline e la Porta Magica (Coraline)', 'animazione', 2009),
('La sposa cadavere (Corpse Bride)', 'animazione', 2005),
('Il Libro della Vita (The Book of Life)', 'animazione', 2014),
('Shrek e vissero felici e contenti (Shrek Forever After)', 'animazione', 2010),
('La principessa Mononoke (Princess Mononoke)', 'animazione', 1997),
('Il Gigante di Ferro (The Iron Giant)', 'animazione', 1999),
('Bolt - Un eroe a quattro zampe (Bolt)', 'animazione', 2008),
('Fantasia', 'animazione', 1940),
('Le Avventure di Tintin - Il segreto dell\'Unicorno (The Adventures of Tintin)', 'animazione', 2011),
('Il Viaggio di Chihiro (Spirited Away)', 'animazione', 2001),
('Il Libro della Vita (The Book of Life)', 'animazione', 2014),
('Rango', 'animazione', 2011);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;