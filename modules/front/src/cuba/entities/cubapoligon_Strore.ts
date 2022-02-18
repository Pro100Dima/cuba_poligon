import { StandardEntity } from "./base/sys$StandardEntity";
import { StoreType } from "../enums/enums";
export class Strore extends StandardEntity {
  static NAME = "cubapoligon_Strore";
  name?: string | null;
  address?: any | null;
  storeType?: StoreType | null;
}
export type StroreViewName = "_base" | "_local" | "_minimal";
export type StroreView<V extends StroreViewName> = V extends "_base"
  ? Pick<Strore, "id" | "name" | "storeType">
  : V extends "_local"
  ? Pick<Strore, "id" | "name" | "storeType">
  : V extends "_minimal"
  ? Pick<Strore, "id" | "name">
  : never;
