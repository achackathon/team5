(function(eaApp, angular, $) {
	'use strict';

	eaApp.config(function($routeProvider, $locationProvider) {
		$routeProvider
		.when('/', {
			templateUrl: 'templates/home.html',
			controller: 'homeController',
			resolve: {}
		})
		.otherwise({
			redirectTo: '/'
		});
	});

})(angular.module('eaApp'), window.angular, window.jQuery);