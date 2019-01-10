package com.lapwingg;

import com.lapwingg.model.*;
import com.lapwingg.model.compositePK.*;
import com.lapwingg.repository.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	private MovieGeneralInfoRepository movieGeneralInfoRepository;
	private TypesOfMovieRepository typesOfMovieRepository;
	private MovieTypeRepository movieTypeRepository;
	private MovieAvailableRepository movieAvailableRepository;
	private TechnologiesOfMovieRepository technologiesOfMovieRepository;
	private MovieTechnologiesRepository movieTechnologiesRepository;
	private LanguagesOfMovieRepository languagesOfMovieRepository;
	private MovieLanguageRepository movieLanguageRepository;
	private CountriesOfMovieRepository countriesOfMovieRepository;
	private MovieCountriesRepository movieCountriesRepository;
	private DirectorsOfMovieRepository directorsOfMovieRepository;
	private MovieDirectorsRepository movieDirectorsRepository;
	private CinemaRoomsRepository cinemaRoomsRepository;
	private CinemaSchedulerRepository cinemaSchedulerRepository;
	private ClientRepository clientRepository;
	private ReportSoldTicketsRepository reportSoldTicketsRepository;

	public DevBootstrap(MovieGeneralInfoRepository mgir,
						TypesOfMovieRepository tmr,
						MovieTypeRepository mtr,
						MovieAvailableRepository mar,
						TechnologiesOfMovieRepository tomr,
						MovieTechnologiesRepository mtcr,
						LanguagesOfMovieRepository lmr,
						MovieLanguageRepository mlr,
						CountriesOfMovieRepository cmr,
						MovieCountriesRepository mcr,
						DirectorsOfMovieRepository dmr,
						MovieDirectorsRepository mdr,
						CinemaRoomsRepository crr,
						CinemaSchedulerRepository csr,
						ClientRepository cr,
						ReportSoldTicketsRepository rstr){
		this.movieGeneralInfoRepository = mgir;
		this.typesOfMovieRepository = tmr;
		this.movieTypeRepository = mtr;
		this.movieAvailableRepository = mar;
		this.technologiesOfMovieRepository = tomr;
		this.movieTechnologiesRepository = mtcr;
		this.languagesOfMovieRepository = lmr;
		this.movieLanguageRepository = mlr;
		this.countriesOfMovieRepository = cmr;
		this.movieCountriesRepository = mcr;
		this.directorsOfMovieRepository = dmr;
		this.movieDirectorsRepository = mdr;
		this.cinemaRoomsRepository = crr;
		this.cinemaSchedulerRepository = csr;
		this.clientRepository = cr;
		this.reportSoldTicketsRepository = rstr;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}

	private void initData(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		MovieGeneralInfo movieGeneralInfo1 = new MovieGeneralInfo("Harry Potter 2", 2002, 176, "Also Awesome", 12);

		TypesOfMovie typesOfMovie = new TypesOfMovie("anime");
		TypesOfMovie typesOfMovie1 = new TypesOfMovie("horror");

		MovieType movieType = new MovieType(new MovieTypeId(typesOfMovie, movieGeneralInfo));
		MovieType movieType1 = new MovieType(new MovieTypeId(typesOfMovie, movieGeneralInfo1));
		MovieType movieType2 = new MovieType(new MovieTypeId(typesOfMovie1, movieGeneralInfo));
		MovieType movieType3 = new MovieType(new MovieTypeId(typesOfMovie1, movieGeneralInfo1));

		MovieAvailable movieAvailable = new MovieAvailable(new MovieAvailableId(movieGeneralInfo), "2018.10.10", null, 20.0);

		TechnologiesOfMovie technologiesOfMovie = new TechnologiesOfMovie("2d");
		TechnologiesOfMovie technologiesOfMovie1 = new TechnologiesOfMovie("3d");

		MovieTechnologies movieTechnologies = new MovieTechnologies(new MovieTechnologiesId(technologiesOfMovie, movieGeneralInfo));
		MovieTechnologies movieTechnologies1 = new MovieTechnologies(new MovieTechnologiesId(technologiesOfMovie, movieGeneralInfo1));

		LanguagesOfMovie languagesOfMovie = new LanguagesOfMovie("PL");
		LanguagesOfMovie languagesOfMovie1 = new LanguagesOfMovie("GER");
		LanguagesOfMovie languagesOfMovie2 = new LanguagesOfMovie("ENG");

		MovieLanguage movieLanguage = new MovieLanguage(new MovieLanguageId(languagesOfMovie, movieGeneralInfo));
		MovieLanguage movieLanguage1 = new MovieLanguage(new MovieLanguageId(languagesOfMovie2, movieGeneralInfo1));

		CountriesOfMovie countriesOfMovie = new CountriesOfMovie("Poland");
		CountriesOfMovie countriesOfMovie1 = new CountriesOfMovie("US");

		MovieCountries movieCountries = new MovieCountries(new MovieCountriesId(countriesOfMovie, movieGeneralInfo));
		MovieCountries movieCountries1 = new MovieCountries(new MovieCountriesId(countriesOfMovie1, movieGeneralInfo));

		DirectorsOfMovie directorsOfMovie = new DirectorsOfMovie("Roman", "Polanski");
		DirectorsOfMovie directorsOfMovie1 = new DirectorsOfMovie("Patryk", "Vega");

		MovieDirectors movieDirectors = new MovieDirectors(new MovieDirectorsId(directorsOfMovie, movieGeneralInfo));

		CinemaRooms cinemaRooms = new CinemaRooms("Oxford", 100);
		CinemaRooms cinemaRooms1 = new CinemaRooms("Pearl Harbor", 666);

		CinemaScheduler cinemaScheduler = new CinemaScheduler(cinemaRooms, movieGeneralInfo, "2018.10.10", null);

		Client client = new Client("Kamil", "Czajka");
		Client client1 = new Client("Andrzej", "Chmiel");

		ReportSoldTickets reportSoldTickets = new ReportSoldTickets(cinemaScheduler, client1, 20);

		movieGeneralInfoRepository.save(movieGeneralInfo);
		movieGeneralInfoRepository.save(movieGeneralInfo1);
//		movieGeneralInfoRepository.save(movieGeneralInfo);
//		movieGeneralInfoRepository.save(movieGeneralInfo1);

		typesOfMovieRepository.save(typesOfMovie);
		typesOfMovieRepository.save(typesOfMovie1);
		//	typesOfMovieRepository.save(typesOfMovie);
		//	typesOfMovieRepository.save(typesOfMovie);


		movieTypeRepository.save(movieType);
		movieTypeRepository.save(movieType1);
		movieTypeRepository.save(movieType2);
		movieTypeRepository.save(movieType3);

		movieAvailableRepository.save(movieAvailable);

		technologiesOfMovieRepository.save(technologiesOfMovie);
		technologiesOfMovieRepository.save(technologiesOfMovie1);

		movieTechnologiesRepository.save(movieTechnologies);
		movieTechnologiesRepository.save(movieTechnologies1);

		languagesOfMovieRepository.save(languagesOfMovie);
		languagesOfMovieRepository.save(languagesOfMovie1);
		languagesOfMovieRepository.save(languagesOfMovie2);

		movieLanguageRepository.save(movieLanguage);
		movieLanguageRepository.save(movieLanguage1);

		countriesOfMovieRepository.save(countriesOfMovie);
		countriesOfMovieRepository.save(countriesOfMovie1);

		movieCountriesRepository.save(movieCountries);
		movieCountriesRepository.save(movieCountries1);

		directorsOfMovieRepository.save(directorsOfMovie);
		directorsOfMovieRepository.save(directorsOfMovie1);

		movieDirectorsRepository.save(movieDirectors);

		cinemaRoomsRepository.save(cinemaRooms);
		cinemaRoomsRepository.save(cinemaRooms1);

		cinemaSchedulerRepository.save(cinemaScheduler);

		clientRepository.save(client);
		clientRepository.save(client1);

		reportSoldTicketsRepository.save(reportSoldTickets);
	}
}

