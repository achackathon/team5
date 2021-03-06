(function(eaApp, angular, $) {
	'use strict';

	eaApp.config(function($routeProvider, $locationProvider) {
		$routeProvider
		.when('/', {
			templateUrl: 'templates/home.html',
			controller: 'homeController',
			resolve: {}
		})
		.when('/search', {
			templateUrl: 'templates/search.html',
			controller: 'searchController',
			resolve: {
				categories: function(searchService) {
					return searchService.listCategories();
				}
			}
		})
		.when('/advancedSearch', {
			templateUrl: 'templates/advancedSearch.html',
			controller: 'advancedSearchController',
			resolve: {}
		})
		.when('/register', {
			templateUrl: 'templates/register.html',
			controller: 'registerController',
			resolve: {
				accessibilityItems: function(registerService) {
					return registerService.listAccessibility();
				},
				categories: function(registerService) {
					return registerService.listCategories();
				}
			}
		})
		.when('/establishment/:establishmentId', {
			templateUrl: 'templates/establishment.html',
			controller: 'establishmentController',
			resolve: {}
		})
		.otherwise({
			redirectTo: '/'
		});
	});

})(angular.module('eaApp'), window.angular, window.jQuery);