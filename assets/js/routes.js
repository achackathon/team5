(function(eaApp, angular, $) {
	'use strict';

	eaApp.config(function($routeProvider, $locationProvider) {
		$routeProvider
		.when('/', {
			templateUrl: 'templates/dashboard.html',
			controller: 'dashboardController',
			resolve: {}
		})
		.otherwise({
			redirectTo: '/'
		});
	});

})(angular.module('eaApp'), window.angular, window.jQuery);