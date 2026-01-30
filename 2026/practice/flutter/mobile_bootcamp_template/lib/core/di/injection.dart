import 'package:get_it/get_it.dart';

import '../cubit/bottom_nav_cubit.dart';

final getIt = GetIt.instance;

Future<void> setupDependencies() async {
  getIt.registerSingleton<BottomNavCubit>(BottomNavCubit());
}
