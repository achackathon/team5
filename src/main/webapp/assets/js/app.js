(function(angular, $) {
	'use strict';

	//eaApp stands for 'Estabelecimento Acessível App'
	var eaApp = angular.module('eaApp', ['ngRoute']);

	eaApp.run(['$rootScope', '$location', function ($rootScope, $location) {
		$rootScope.$on('$locationChangeSuccess', function(event) {
			$rootScope.queryString = $.param($location.search()); //used to persirst query string with ng-href
		});
	}]);

})(window.angular, window.jQuery);